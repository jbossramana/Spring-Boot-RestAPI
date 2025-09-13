package demo.boot.controller;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.JsonPatchException;

import demo.boot.exception.CustomerNotFoundException;
import demo.boot.model.Customer;
import demo.boot.service.CustomerService;



@RestController
@RequestMapping(value = "/customer")
public class CustomerRestController {
    private CustomerService customerService;
    private ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    public CustomerRestController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public Optional<Customer> getCustomerById(@PathVariable String id)
    {
    	return customerService.findCustomer(id);
    }
    
    
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer customerCreated = customerService.createCustomer(customer);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                                  .path("/{id}")
                                                  .buildAndExpand(customerCreated.getId())
                                                  .toUri();
        return ResponseEntity.created(location).build();
    }

    @PatchMapping(path = "/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable String id, @RequestBody Customer updatephone) {
        try {
            Customer customer = customerService.findCustomer(id).orElseThrow(CustomerNotFoundException::new);
            
            customer.setTelephone(updatephone.getTelephone());
            
            customerService.updateCustomer(customer);

            return ResponseEntity.ok(customer);
        } catch (CustomerNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    
    
    @PatchMapping(path = "/adv/{id}", consumes = "application/json-patch+json")
    public ResponseEntity<Customer> updateCustomerAdv(@PathVariable String id,
                                                   @RequestBody JsonPatch patch) {
        try {
            Customer customer = customerService.findCustomer(id).orElseThrow(CustomerNotFoundException::new);
            Customer customerPatched = applyPatchToCustomer(patch, customer);
            customerService.updateCustomer(customerPatched);

            return ResponseEntity.ok(customerPatched);
        } catch (CustomerNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } catch (JsonPatchException | JsonProcessingException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    private Customer applyPatchToCustomer(JsonPatch patch, Customer targetCustomer) throws JsonPatchException, JsonProcessingException {
        JsonNode patched = patch.apply(objectMapper.convertValue(targetCustomer, JsonNode.class));
        return objectMapper.treeToValue(patched, Customer.class);
    }
}

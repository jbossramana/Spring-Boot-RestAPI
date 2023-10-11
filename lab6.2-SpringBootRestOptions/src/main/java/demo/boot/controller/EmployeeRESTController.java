package demo.boot.controller;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeRESTController 
{
	
   @RequestMapping( method = RequestMethod.OPTIONS)
   public ResponseEntity<?> collectionOptions() 
   {
      return ResponseEntity
          .ok()
          .allow(HttpMethod.GET, HttpMethod.POST, HttpMethod.DELETE, HttpMethod.OPTIONS)
              .build();
   }
    
   @RequestMapping(value="{id}", method = RequestMethod.OPTIONS)
   public ResponseEntity<?> singularOptions() 
   {
      return ResponseEntity
          .ok()
          .allow(HttpMethod.GET, HttpMethod.DELETE, HttpMethod.PUT, HttpMethod.OPTIONS)
              .build();
   }

	 @RequestMapping( method = RequestMethod.HEAD)
   public ResponseEntity<String> headRequest() {
       // Perform any necessary logic for the HEAD request.
       
       // Create a response message
       String message = "This is a sample response for HEAD request.";
       
       // Return the message with appropriate headers
       return ResponseEntity.ok()
           .header("Custom-Header", "SomeValue")
           .body(message);
   }
   

}

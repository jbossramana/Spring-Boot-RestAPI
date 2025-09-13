package demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository("customerDAO")
@Transactional
public class CustomerDAOImpl  implements CustomerDAO{
 
  @PersistenceContext   // @Autowired
 public EntityManager entityManager;

  @Transactional(propagation = Propagation.MANDATORY)   // it will participate in tx1
 public Customer addCustomer(Customer customer) {
     entityManager.persist(customer);
     return customer;
 }
 @Transactional
 public Customer updateCustomer(Customer customer) {
       entityManager.merge(customer);
       return customer;
 }
 @Transactional
 public void deleteCustomer(long customerId) {
 // delete code goes here
 }

 @Transactional
 public Customer getCustomer(long customerId) {
  //    String sql = "select customer from Customer customer where customer.customerId="+customerId;
      
      try{
       //  return (Customer) entityManager.createQuery(sql).getSingleResult();
    	  return (Customer) entityManager.find(Customer.class, customerId);
      }catch(Exception e){
     }
      return null;
 }
 @Transactional
 public List<Customer> getCustomers() {
     return entityManager.createQuery("from Customer").getResultList();
     
     
 }
}
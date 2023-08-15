package demo.boot.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import demo.boot.model.Customer;


@Component
public class CustomerBeanService {

	public static List<Customer> customers= new ArrayList<>();
	
	static
	{
		customers.add(new Customer("rushi","hyderabad"));
		customers.add(new Customer("maharshi","chennai"));
		customers.add(new Customer("surya", "mumbai"));
	}
	
   public List<Customer> findAll()
   {
	   return customers;
   }

   public Customer saveCustomer(Customer customer)
   {
	   customers.add(customer);
	   return customer;
   }
   
   public Customer findCustomer(String name)
   {

   for (Customer  customer:customers)
   {
   if(customer.getName().equals(name))
   {
   return customer;
   }
   }
   return null;
   }
   
   public  Customer deleteByName(String name)
   {
   Iterator<Customer>  iterator = customers.iterator();

   while(iterator.hasNext())
   {
   Customer customer = iterator.next();
   if (customer.getName().equals(name))
   {
   iterator.remove();
   return customer;
   }
   }
   return null;
   }
   }


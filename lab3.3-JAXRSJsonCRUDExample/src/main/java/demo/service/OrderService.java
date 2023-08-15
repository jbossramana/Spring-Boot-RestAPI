package demo.service;

import java.util.ArrayList;
import java.util.List;

import demo.model.Order;

public class OrderService {

	
	static List<Order> orders = new ArrayList<>();
	
	
	public List<Order> getOrders()
	{
		System.out.println();
		return orders;
	}
	
	public void addOrder(Order order)
	{
		orders.add(order);
	}
	

	
}

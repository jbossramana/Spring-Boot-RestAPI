package demo.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import demo.model.Order;
import demo.service.OrderService;

@Path("order")
public class OrderController {

	OrderService orderService = new OrderService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Order> getOrders()
	{
		return orderService.getOrders();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void addOrder(Order order)
	{
		orderService.addOrder(order);
	}
	
}

package com.acs.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.acs.customer.entity.Customer;
import com.acs.customer.entity.Orders;
import com.acs.customer.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;

	//@Autowired
	//private RestTemplate restTemplate;

	@GetMapping
	public List<Orders> getAllOrders() {
		return orderService.getAllOrders();
	}

	@PostMapping
	public Orders createOrder(@RequestBody Orders order) {
		return orderService.saveOrder(order);
	}
/*
	@GetMapping("/{orderId}/customer")
	public Customer getCustomerForOrder(@PathVariable Long orderId) {
		Order order = orderService.getOrderById(orderId);
		String url = "http://CUSTOMER-SERVICE/customers/" + order.getCustomerId();
		return restTemplate.getForObject(url, Customer.class);
	}
	*/
}

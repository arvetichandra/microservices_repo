package com.acs.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acs.customer.entity.Orders;
import com.acs.customer.repo.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public List<Orders> getAllOrders() {
		return orderRepository.findAll();
	}

	public Orders saveOrder(Orders order) {
		return orderRepository.save(order);
	}

	public Orders getOrderById(Long orderId) {
		// TODO Auto-generated method stub
		return orderRepository.getById(orderId);
	}
}
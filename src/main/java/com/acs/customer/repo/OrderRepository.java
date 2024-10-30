package com.acs.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acs.customer.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {
}
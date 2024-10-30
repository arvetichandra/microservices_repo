package com.acs.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acs.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
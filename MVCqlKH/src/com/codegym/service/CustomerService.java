package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface CustomerService {
    //tra ve 1 list
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);
}

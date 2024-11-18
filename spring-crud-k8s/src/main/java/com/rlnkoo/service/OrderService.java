package com.rlnkoo.service;

import com.rlnkoo.entity.Order;
import com.rlnkoo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public Order addOrder(Order order) {
        return repository.save(order);
    }

    public List<Order> getOrders(){
        return repository.findAll();
    }

    public Order getOrderById(int id) {
        return repository.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid id"));
    }
}

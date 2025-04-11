package com.example.dinerestaurant.controller;

import com.example.dinerestaurant.model.Order;
import com.example.dinerestaurant.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        order.setStatus("pending");
        order.setTimestamp(new java.util.Date());
        return orderRepository.save(order);
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable String id) {
        return orderRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable String id, @RequestBody Order updatedOrder) {
        updatedOrder.setId(id);
        return orderRepository.save(updatedOrder);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable String id) {
        orderRepository.deleteById(id);
    }
}

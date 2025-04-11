package com.example.dinerestaurant.controller;

import com.example.dinerestaurant.model.Payment;
import com.example.dinerestaurant.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentRepository paymentRepository;

    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @PostMapping
    public Payment createPayment(@RequestBody Payment payment) {
        payment.setPaid(true);
        return paymentRepository.save(payment);
    }

    @GetMapping("/{id}")
    public Payment getPaymentById(@PathVariable String id) {
        return paymentRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Payment updatePayment(@PathVariable String id, @RequestBody Payment updatedPayment) {
        updatedPayment.setId(id);
        return paymentRepository.save(updatedPayment);
    }

    @DeleteMapping("/{id}")
    public void deletePayment(@PathVariable String id) {
        paymentRepository.deleteById(id);
    }
}

package com.hrishav.solid.controller;

import com.hrishav.solid.model.PaymentRequest;
import com.hrishav.solid.model.RefundRequest;
import com.hrishav.solid.service.PaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for handling payment and refund requests.
 * Exposes endpoints to process payments and refunds.
 */
@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @Autowired
    private PaymentProcessor processor;

    // Endpoint to process a payment request
    @PostMapping
    public String process(@RequestBody PaymentRequest request) {
        processor.handlePayment(request.getMethod(), request.getAmount());
        return "Payment Processing Started";
    }

    // Endpoint to process a refund request
    @PostMapping("/refund")
    public String refund(@RequestBody RefundRequest request) {
        processor.handleRefund(request.getMethod(), request.getAmount());
        return "Refund request initiated!";
    }
}

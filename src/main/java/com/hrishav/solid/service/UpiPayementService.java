package com.hrishav.solid.service;

import org.springframework.stereotype.Service;

/**
 * Service for processing UPI payments.
 * Adheres to LSP: Can replace PaymentService without issues.
 * Adheres to ISP: Does not implement Refundable because UPI doesn't support refunds in this system.
 */
@Service
public class UpiPayementService implements PaymentService {

    // Process the payment for the given amount using UPI
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
    }

    // Return the payment method key for UPI payments
    @Override
    public String getMethodKey() {
        return "upi";
    }
}

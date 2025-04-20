package com.hrishav.solid.service;

/**
 * Interface for processing payments with a focused set of methods.
 * Adheres to ISP by including only what's needed for payment processing.
 */
public interface PaymentService {

    // Process the payment with the given amount
    void processPayment(double amount);

    // Get the method key (e.g., "card", "upi") to identify the payment method
    String getMethodKey();
}

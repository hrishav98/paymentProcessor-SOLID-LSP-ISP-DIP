package com.hrishav.solid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Handles payment and refund processing.
 * Adheres to DIP: Depends on abstractions (PaymentService), not specific implementations.
 * Uses payment and refundable service lists injected through Spring.
 */
@Service
public class PaymentProcessor {

    private final Map<String, PaymentService> paymentServices = new HashMap<>();
    private final Map<String, Refundable> refundableServices = new HashMap<>();

    // Constructor injects the list of available PaymentServices and categorizes them by method
    @Autowired
    public PaymentProcessor(List<PaymentService> services) {
        for (PaymentService service : services) {
            String key = service.getMethodKey();
            paymentServices.put(key, service);

            // Add to refundableServices map if the service supports refunds
            if (service instanceof Refundable) {
                refundableServices.put(key, (Refundable) service);
            }
        }
    }

    // Handle payment for the specified method and amount
    public void handlePayment(String method, double amount) {
        PaymentService service = paymentServices.get(method);
        if (service != null) {
            service.processPayment(amount);
        } else {
            System.out.println("Unsupported payment method: " + method);
        }
    }

    // Handle refund for the specified method and amount
    public void handleRefund(String method, double amount) {
        Refundable service = refundableServices.get(method);
        if (service != null) {
            service.processRefund(amount);
        } else {
            System.out.println("Refund not supported for method: " + method);
        }
    }
}

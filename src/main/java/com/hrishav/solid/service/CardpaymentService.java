package com.hrishav.solid.service;

import org.springframework.stereotype.Service;

/**
 * Service for processing card payments and handling refunds.
 * Implements PaymentService for payment processing and Refundable for refund support.
 * Adheres to LSP: Can be used wherever PaymentService is expected.
 * Adheres to ISP: Implements Refundable only because it supports refunds.
 */
@Service
public class CardpaymentService implements PaymentService, Refundable {

    // Process the payment for the given amount using a card
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing card payment of ₹" + amount);
    }

    // Return the payment method key for card payments
    @Override
    public String getMethodKey() {
        return "card";
    }

    // Process a refund for the given amount to the card
    @Override
    public void processRefund(double amount) {
        System.out.println("Refunding ₹" + amount + " to card.");
    }
}

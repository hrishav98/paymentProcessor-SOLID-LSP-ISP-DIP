package com.hrishav.solid.model;

/**
 * Represents a refund request with the amount and payment method.
 */
public class RefundRequest {

    private double amount;  // Refund amount
    private String method;  // Payment method (e.g., card, UPI)

    // Getters and setters

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}

package com.hrishav.solid.service;

/**
 * Interface for services that support refunds.
 * Adheres to ISP by separating refund functionality into its own interface.
 */
public interface Refundable {

    // Process the refund for the given amount
    void processRefund(double amount);
}

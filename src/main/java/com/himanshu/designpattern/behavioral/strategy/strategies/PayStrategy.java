package com.himanshu.designpattern.behavioral.strategy.strategies;


/**
 * Common interface for all strategies.
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}

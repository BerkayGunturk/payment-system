package com.n11.processor;

import com.n11.contract.IPayment;

public class PaymentProcessor {

    private IPayment iPayment;

    public PaymentProcessor(IPayment iPayment)
    {
        this.iPayment = iPayment;
    }

    public String processPayment(double amount)
    {
        return this.iPayment.pay(amount);
    }

}

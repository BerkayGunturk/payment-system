package com.n11.method;

import com.n11.contract.IPayment;

public class PayPalPayment implements IPayment {
    @Override
    public String pay(double amount) {
        return amount + " TL Paypal ile ödendi.";
    }
}

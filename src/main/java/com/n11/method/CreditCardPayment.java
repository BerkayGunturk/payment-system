package com.n11.method;

import com.n11.contract.IPayment;

public class CreditCardPayment implements IPayment {
    @Override
    public String pay(double amount) {
        return amount + " TL Kredi kartı ile ödendi.";
    }
}

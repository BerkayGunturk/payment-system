package com.n11.factory;

import com.n11.contract.IPayment;

public class PaymentFactory {
    @SuppressWarnings("deprecation")
    public IPayment create(String className)
    {
        Class c;
        IPayment iPaymentType = null;
        try
        {
            c = Class.forName("com.n11.method."+className);
            iPaymentType =(IPayment) c.newInstance();
        }
        catch (Exception e)
        {
            System.out.println("Hata: '" + className + "' bulunamadı.");
            e.printStackTrace();
        }
        return iPaymentType;
    }
}

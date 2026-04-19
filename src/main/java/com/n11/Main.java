package com.n11;

import com.n11.contract.IPayment;
import com.n11.factory.PaymentFactory;
import com.n11.processor.PaymentProcessor;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ödeme Yöntemi Giriniz : ");

        String paymentType = scanner.nextLine();
        System.out.print("Tutar: ");
        double amount = Double.parseDouble(scanner.nextLine());

        IPayment iPaymentType = null;
        PaymentProcessor paymentProcessor = null;

        try
        {
            PaymentFactory pFactory = new PaymentFactory();
            iPaymentType = pFactory.create(paymentType);
            paymentProcessor = new PaymentProcessor(iPaymentType);
            String totalAmount = iPaymentType.pay(amount);
            System.out.println(totalAmount);

        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}

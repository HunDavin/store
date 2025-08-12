package com.davin.store;

public class stripePaymentService implements PaymentService{

    @Override
    public void processPayment(double amount){
        System.out.println("Stripe");
        System.out.println("Amout: "+ amount);
    }
}

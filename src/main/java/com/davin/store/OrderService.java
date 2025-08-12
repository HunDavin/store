package com.davin.store;

public class OrderService {
    public void placeOrder(){
        var paymenService = new stripePaymentService();
        paymenService.processPayment(15);
    }
}

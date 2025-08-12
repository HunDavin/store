package com.davin.store;

import org.springframework.stereotype.Service;

@Service //annotation for bean of IOC
public class OrderService {
    private PaymentService paymentService;

    // @Autowired
    /*AutoWired it needed when class has another default constructor 
     * or has another different constructor
     */
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    public void placeOrder(){
        paymentService.processPayment(20);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}

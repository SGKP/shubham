package com.codingshuttle.youtube.shubham;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="payment.provider",havingValue="razorpay")

public class RazorpayPayments implements PaymentService {

    public String pay(){
        String payment ="Razorpay Payment";
        System.out.println("Payments from :"+payment);
        return payment;

    }
}

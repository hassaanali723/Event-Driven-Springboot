package com.eda.cafe_management_system.Services;

import com.eda.cafe_management_system.Event.CheckoutEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


@Service
public class BillingService {

//
//    public void generateBill(String customerId) {
//        // Logic to generate bill
//        System.out.println("Generating bill for customer: " + customerId);
//    }

    @Async
    @EventListener
    public void generateBill(CheckoutEvent event) {
        System.out.println("Generating bill for customer: " + event.getCustomerId() + " on thread " + Thread.currentThread().getName());
        // Logic to generate bill
    }
}
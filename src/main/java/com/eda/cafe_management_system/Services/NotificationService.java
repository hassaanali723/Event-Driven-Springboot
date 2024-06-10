package com.eda.cafe_management_system.Services;

import com.eda.cafe_management_system.Event.CheckoutEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
//    public void notifyCustomer(String customerId) {
//        // Logic to notify customer
//        System.out.println("Notifying customer: " + customerId);
//    }
@Async
@EventListener
public void notifyCustomer(CheckoutEvent event) {
    System.out.println("Notifying customer: " + event.getCustomerId() + " on thread " + Thread.currentThread().getName());
    // Logic to notify customer
}
}
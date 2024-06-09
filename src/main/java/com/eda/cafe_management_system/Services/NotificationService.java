package com.eda.cafe_management_system.Services;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public void notifyCustomer(String customerId) {
        // Logic to notify customer
        System.out.println("Notifying customer: " + customerId);
    }
}
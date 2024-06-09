package com.eda.cafe_management_system.Services;

import org.springframework.stereotype.Service;

@Service
public class BillingService {
    public void generateBill(String customerId) {
        // Logic to generate bill
        System.out.println("Generating bill for customer: " + customerId);
    }
}
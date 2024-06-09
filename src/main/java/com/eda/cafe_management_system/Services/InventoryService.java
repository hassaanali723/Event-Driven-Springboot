package com.eda.cafe_management_system.Services;

import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    public void updateInventory(String customerId) {
        // Logic to update inventory
        System.out.println("Updating inventory for customer: " + customerId);
    }
}
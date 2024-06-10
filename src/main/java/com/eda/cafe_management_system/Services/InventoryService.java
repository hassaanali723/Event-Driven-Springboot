package com.eda.cafe_management_system.Services;

import com.eda.cafe_management_system.Event.CheckoutEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
//    public void updateInventory(String customerId) {
//        // Logic to update inventory
//        System.out.println("Updating inventory for customer: " + customerId);
//    }
@Async
@EventListener
public void updateInventory(CheckoutEvent event) {
    System.out.println("Updating inventory for customer: " + event.getCustomerId() + " on thread " + Thread.currentThread().getName());
    // Logic to update inventory
}


}
package com.eda.cafe_management_system.Services;

import com.eda.cafe_management_system.Event.CheckoutEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class CleaningService {
//    public void cleanTables() {
//        // Logic to clean tables
//        System.out.println("Cleaning tables after checkout.");
//    }
@Async
@EventListener
public void cleanTables(CheckoutEvent event) {
    System.out.println("Cleaning tables after checkout on thread " + Thread.currentThread().getName());
    // Logic to clean tables
}


}
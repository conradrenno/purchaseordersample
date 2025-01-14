package com.devrenno.ordersample.services;

import com.devrenno.ordersample.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    
    public double shipping(Order order){
        if (order.getBasicValue() > 200.00){
            return 00.00;
        } else if (order.getBasicValue() > 100.00 && order.getBasicValue() < 200.00) {
            return 12.00;
        } else {
            return 20.00;
        }
    }
}

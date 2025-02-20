package org.example.service;

import org.example.dto.Order;

import java.util.List;

public interface OrderService {
    void addOrder(Order Order);

    void updateOrder(Order Order);

    void deleteOrder(String id);
    List<Order> getAll();


}

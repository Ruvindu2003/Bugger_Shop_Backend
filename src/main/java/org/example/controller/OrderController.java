package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Order;
import org.example.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Order")
@CrossOrigin
@RequiredArgsConstructor

public class OrderController {
    final OrderService orderService;

    @PostMapping("/Order-add")
    public void addOrder(@RequestBody Order Order){
        orderService.addOrder(Order);
    }
    @PutMapping("/Order-update")
    public void updateOrder(@RequestBody Order Order){

        orderService.updateOrder(Order);
    }
    @DeleteMapping("/Order-Delete/{id}")
    public void deleteOrder(@PathVariable String id){

        orderService.deleteOrder(id);
    }

    @GetMapping("/getAll")
    public List<Order> getAllOrder(){
        return orderService.getAll();
    }




}

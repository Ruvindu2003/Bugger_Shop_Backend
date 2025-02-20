package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.Order;
import org.example.entity.Orderentity;
import org.example.repository.OrderRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class OrderImpl implements OrderService{
    final OrderRepository orderRepository;
    final ModelMapper modelMapper;

    @Override
    public void addOrder(Order Order) {
        orderRepository.save(modelMapper.map(Order, Orderentity.class));


    }



    @Override
    public void updateOrder(Order Order) {
        orderRepository.save(modelMapper.map(Order, Orderentity.class));

    }

    @Override
    public void deleteOrder(String id) {
        orderRepository.deleteById(id);

    }

    @Override
    public List<Order> getAll() {
        List<Order> orderList=new ArrayList<>();
        List<Orderentity> all=orderRepository.findAll();
        all.forEach(Orderentity ->{
            orderList.add(modelMapper.map(Orderentity,Order.class));


        });

        return orderList;
    }


}

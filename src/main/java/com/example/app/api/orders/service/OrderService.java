package com.example.app.api.orders.service;

import com.example.app.api.orders.domain.entity.Orders;
import com.example.app.api.orders.domain.repository.OrderRepository;
import com.example.app.api.orders.dto.OrderDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final ModelMapper modelMapper;
    private final OrderRepository orderRepository;

    public List<OrderDTO> getOrders() {
        List<Orders> orders = orderRepository.findAll();
        return orders.stream()
                .map(e -> modelMapper.map(e, OrderDTO.class))
                .collect(Collectors.toList());
    }
}

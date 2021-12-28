package com.example.app.api.order.controller;

import com.example.app.api.order.dto.OrderDTO;
import com.example.app.api.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping(value = "")
    public ResponseEntity<List<OrderDTO>> getOrders() throws Exception {

        return ResponseEntity.ok()
                .body(orderService.getOrders());
    }

}

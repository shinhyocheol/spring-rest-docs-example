package com.example.app.api.order.domain.repository;

import com.example.app.api.order.domain.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Long> {
}

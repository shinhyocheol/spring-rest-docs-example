package com.example.app.api.order.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class OrderDTO {

    private Long id;
    private Long productId;
    private Long userId;
    private int amount;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}

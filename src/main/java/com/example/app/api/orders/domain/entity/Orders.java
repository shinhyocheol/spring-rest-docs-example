package com.example.app.api.orders.domain.entity;

import com.example.app.api.product.domain.entity.Products;
import com.example.app.api.users.domain.entity.Users;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private int amount;

    @Column(nullable = false)
    private String process;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    @ManyToOne
    private Products product;

    @ManyToOne
    private Users user;

    @Builder
    public Orders(
            Long id, int amount, String process,
            Products product, Users user) {
        this.id = id;
        this.amount = amount;
        this.process = process;
        this.product = product;
        this.user = user;
    }


}

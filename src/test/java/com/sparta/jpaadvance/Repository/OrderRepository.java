package com.sparta.jpaadvance.Repository;

import com.sparta.jpaadvance.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}

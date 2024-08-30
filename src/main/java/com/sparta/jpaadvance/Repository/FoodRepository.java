package com.sparta.jpaadvance.Repository;

import com.sparta.jpaadvance.Entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Long> {
}

package com.sparta.jpaadvance.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;

    @ManyToOne
    //FK column 명은 name
    //관계를 맺고 싶은 entity 를 필드로 가짐
    @JoinColumn(name = "user_id")
    private User user;
}
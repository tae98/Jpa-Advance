package com.sparta.jpaadvance.Repository;

import com.sparta.jpaadvance.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

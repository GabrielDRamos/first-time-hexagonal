package com.example.hexagonal_exercise.adapters.output;

import com.example.hexagonal_exercise.adapters.output.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDomainRepository extends JpaRepository<UserEntity, Long> {
}

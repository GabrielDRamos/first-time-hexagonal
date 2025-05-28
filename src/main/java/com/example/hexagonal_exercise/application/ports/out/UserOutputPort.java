package com.example.hexagonal_exercise.application.ports.out;

import com.example.hexagonal_exercise.application.domain.UserDomain;

public interface UserOutputPort {
    UserDomain create(UserDomain userDomain);
    void delete(UserDomain userDomain);
}

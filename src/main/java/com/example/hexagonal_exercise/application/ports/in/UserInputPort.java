package com.example.hexagonal_exercise.application.ports.in;

import com.example.hexagonal_exercise.application.domain.UserDomain;

public interface UserInputPort {
    UserDomain execute (UserDomain userDomain);
    String deleteUser (UserDomain userDomain);
}

package com.example.hexagonal_exercise.application.usecase;

import com.example.hexagonal_exercise.application.domain.UserDomain;
import com.example.hexagonal_exercise.application.ports.in.UserInputPort;
import com.example.hexagonal_exercise.application.ports.out.UserOutputPort;
import com.example.hexagonal_exercise.utils.UseCase;
import lombok.AllArgsConstructor;

@UseCase
@AllArgsConstructor
public class UserDomainUseCase implements UserInputPort {
    private final UserOutputPort userOutputPort;
    @Override
    public String execute(UserDomain userDomain){
        return userDomain.create(userOutputPort);
    }
    @Override
    public String deleteUser(UserDomain userDomain) {
        return userDomain.delete(userOutputPort);
    }

}

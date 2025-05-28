package com.example.hexagonal_exercise.application.domain;


import com.example.hexagonal_exercise.adapters.output.Entity.UserEntity;
import com.example.hexagonal_exercise.application.ports.out.UserOutputPort;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@Setter
public class UserDomain {
    private long id;
    private String name;
    private String email;
    private String password;

    public String create(UserOutputPort userOutputPort) {
        userOutputPort.create(this);
        return  "User created";
    }

    public String delete(UserOutputPort userOutputPort){
        userOutputPort.delete(this);
        return "User deleted";
    }

    public List<UserDomain> list(){ return new ArrayList<>(); }
    public UserDomain get(){
        return this;
    }

    public UserDomain toUserDomain(UserEntity entity){
       return UserDomain.builder()
                .name(entity.getName())
                .email(entity.getEmail())
                .password(entity.getPassword())
                .build();

    }
}

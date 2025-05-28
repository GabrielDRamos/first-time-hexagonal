package com.example.hexagonal_exercise.adapters.input.request;

import com.example.hexagonal_exercise.application.domain.UserDomain;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserRequest {
    private String name;
    private String email;
    private String password;


    public UserDomain toUserDomain(UserRequest request) {
        return  UserDomain.builder()
                .name(request.name)
                .email(request.email)
                .password(request.password)
                .build();
    }
}

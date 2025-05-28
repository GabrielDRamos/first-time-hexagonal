package com.example.hexagonal_exercise.adapters.input;

import com.example.hexagonal_exercise.adapters.input.request.UserRequest;
import com.example.hexagonal_exercise.application.domain.UserDomain;
import com.example.hexagonal_exercise.application.ports.in.UserInputPort;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {
    private final UserInputPort userInputPort;
    @PostMapping
    public UserDomain create(@RequestBody UserRequest request) {
        return  userInputPort.execute(request.toUserDomain(request));
    }

    @DeleteMapping
    public String delete(@RequestBody UserRequest request) {
        return  userInputPort.deleteUser(request.toUserDomain(request));
    }
}

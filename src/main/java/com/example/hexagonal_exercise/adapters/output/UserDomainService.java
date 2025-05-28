package com.example.hexagonal_exercise.adapters.output;
import com.example.hexagonal_exercise.adapters.output.Entity.UserEntity;
import com.example.hexagonal_exercise.application.domain.UserDomain;
import com.example.hexagonal_exercise.application.ports.out.UserOutputPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserDomainService implements UserOutputPort {
    private UserDomainRepository userDomainRepository;
    @Override
    public UserDomain create(UserDomain userDomain) {
        var entity = toUserEntity(userDomain);
        this.userDomainRepository.save(entity);
        return userDomain.toUserDomain(entity);
    }
    @Override
    public void delete(UserDomain userDomain) {
        this.userDomainRepository.delete(toUserEntity(userDomain));
    }

    private UserEntity toUserEntity(UserDomain domain){
        return UserEntity.builder()
                .name(domain.getName())
                .email(domain.getEmail())
                .password(domain.getPassword())
                .build();
    }

}

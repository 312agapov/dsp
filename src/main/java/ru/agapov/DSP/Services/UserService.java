package ru.agapov.DSP.Services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.agapov.DSP.Entities.User;
import ru.agapov.DSP.Repositories.UserRepository;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User getUserById(UUID id){
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()){
            return user.get();
        }
        throw new EntityNotFoundException("Нет пользователя с таким ID");
    }
}

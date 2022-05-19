package ro.sd.a2.service;

import org.springframework.stereotype.Service;
import ro.sd.a2.dto.CreateUserDtoFront;
import ro.sd.a2.entity.User;
import ro.sd.a2.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Transactional
    public void createAcount(CreateUserDtoFront dto){
        User existent = userRepository.findFirstByName(dto.getName());
        if(existent == null)
        {
            User user = User.builder().name(dto.getName()).password(dto.getPassword()).email(dto.getEmail()).build();
            userRepository.save(user);
        }
    }

    //public boolean logIn
}

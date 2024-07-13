package practice.service;

import practice.model.*;
import practice.repository.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UserService {
    private UserRepository userRepository;

    public UserService (UserRepository userRepository)
    {
        log.info("UserService constructor");
        this.userRepository = userRepository;
    }

    public User getById(Long id) {
        log.info("in UserService getById {}", id);
        Optional<User> u = userRepository.findById(id);
        return (User) u.get();
    }

    public void save (User user) {
        log.info("in UserService save}");
        userRepository.save(user);
    }

    public void deleteById(Long id) {
        log.info("in UserService deleteById {}", id);
        userRepository.deleteById(id);
    }

    public List<User> getAll() {
        log.info("in UserService getALl}");
        return (List<User>) userRepository.findAll();
    }


}

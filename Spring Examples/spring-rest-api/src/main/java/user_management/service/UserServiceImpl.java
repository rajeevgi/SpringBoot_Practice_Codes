package user_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import user_management.entity.User;
import user_management.exception.ResourceNotFoundException;
import user_management.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    // Constructor Injection
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
      return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User with id " + id + " not found."));
    }

    @Override
    public User updateUserById(int id, User user) {
        User savedUser = getUserById(id);

        savedUser.setName(user.getName());
        savedUser.setEmail(user.getEmail());
        savedUser.setAge(user.getAge());

        return userRepository.save(savedUser);
    }

    @Override
    public void deleteUserById(int id) {
        User user = getUserById(id);

        userRepository.delete(user);
        
    }
}

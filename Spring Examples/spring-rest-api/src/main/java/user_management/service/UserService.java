package user_management.service;

import java.util.List;

import user_management.entity.User;

public interface UserService {

    User createUser(User user);

    List<User> getAllUsers();

    User getUserById(int id);

    User updateUserById(int id, User user);

    void deleteUserById(int id);
}

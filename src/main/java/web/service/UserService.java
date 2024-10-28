package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void createUser(User user);
    List<User> getUsers();
    void update(User user);
    void delete(Long id);
    User getUsers(Long id);
}

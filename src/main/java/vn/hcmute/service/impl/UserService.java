package vn.hcmute.service.impl;

import vn.hcmute.entity.User;
import vn.hcmute.repository.UserRepository;

import java.util.List;

public class UserService implements vn.hcmute.service.IUserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> allUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }
}

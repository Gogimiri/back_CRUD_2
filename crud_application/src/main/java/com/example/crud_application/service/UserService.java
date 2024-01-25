package com.example.crud_application.service;

import com.example.crud_application.dto.UserDto;
import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(Long userId, UserDto updatedUserDto);

    void deleteUser(Long userId);
}

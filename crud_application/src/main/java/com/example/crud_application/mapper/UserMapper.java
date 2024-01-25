package com.example.crud_application.mapper;

import com.example.crud_application.dto.UserDto;
import com.example.crud_application.entity.User;

public class UserMapper {

    public static UserDto mapToUserDto(User user) {
        return new UserDto(
            user.getId(),
            user.getName(),
            user.getEmail(),
            user.getPassword()
        );
    }
    public static User mapToUser(UserDto userDto) {
        return new User(
                userDto.getId(),
                userDto.getName(),
                userDto.getEmail(),
                userDto.getPassword()
        );
    }
}

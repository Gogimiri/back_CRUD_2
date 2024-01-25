package com.example.river_suka.mapper;

import com.example.river_suka.dto.UserDto;
import com.example.river_suka.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

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

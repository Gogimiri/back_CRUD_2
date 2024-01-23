package com.example.river_suka.service.implementation;

import com.example.river_suka.dto.UserDto;
import com.example.river_suka.entity.User;
import com.example.river_suka.exception.ResourceNotFoundException;
import com.example.river_suka.repository.UserRepository;
import com.example.river_suka.service.UserService;
import lombok.AllArgsConstructor;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = UserMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        return UserMapper.mapToUserDto(savedUser);
    }

    @Override
    public UserDto getUserById(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User is not found - " + userId));
        return UserMapper.mapToUserDto(user);
    }
}

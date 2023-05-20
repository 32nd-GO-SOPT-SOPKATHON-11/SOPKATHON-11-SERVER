package sopt.org.sopkathon.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sopt.org.sopkathon.controller.dto.response.UserResponseDto;
import sopt.org.sopkathon.domain.User;
import sopt.org.sopkathon.exception.Error;
import sopt.org.sopkathon.infrastructure.UserRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public List<UserResponseDto> getUserList() {
        System.out.println("DFSDF");
        List<User> users = userRepository.getAll();


        return users.stream()
                .map(user -> UserResponseDto.of(
                        user.getId(),
                        user.getName(),
                        user.getAge(),
                        user.getLocal(),
                        user.getProfileImage()
                )).collect(Collectors.toList());
    }
}

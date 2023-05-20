package sopt.org.sopkathon.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import sopt.org.sopkathon.common.dto.ApiResponse;
import sopt.org.sopkathon.controller.dto.response.UserResponseDto;
import sopt.org.sopkathon.exception.Success;
import sopt.org.sopkathon.service.UserService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse<List<UserResponseDto>> getUserList() {
        return ApiResponse.success(Success.USERS_FIND_SUCCESS, userService.getUserList());
    }
}

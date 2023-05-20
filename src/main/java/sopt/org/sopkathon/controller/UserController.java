package sopt.org.sopkathon.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sopt.org.sopkathon.common.dto.ApiResponse;
import sopt.org.sopkathon.controller.dto.response.UserDetailResponseDto;
import sopt.org.sopkathon.controller.dto.response.MatchingResponseDto;
import sopt.org.sopkathon.controller.dto.response.UserResponseDto;
import sopt.org.sopkathon.exception.Success;
import sopt.org.sopkathon.exception.model.NotFoundException;
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

    @GetMapping("/{userId}")
    public ApiResponse<UserDetailResponseDto> getUserDetail(@PathVariable Long userId) throws NotFoundException{
        return ApiResponse.success(Success.USER_DETAIL_FIND_SUCCESS, userService.getUserDetail(userId));
    }

    @GetMapping("/matching")
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse<List<MatchingResponseDto>> getMatchingUserList() throws NotFoundException {
        return ApiResponse.success(Success.USERS_FIND_SUCCESS, userService.getMatchingList(1L));
    }
}

package sopt.org.sopkathon.common.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import sopt.org.sopkathon.exception.Success;
import sopt.org.sopkathon.exception.Error;
@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ApiResponse<T> {
    private final int code;
    private final boolean isSuccess;
    private T data;


    public static ApiResponse success(Success success) {
        return new ApiResponse<>(success.getHttpStatusCode(), true);
    }

    public static <T> ApiResponse<T> success(Success success, T data) {
        return new ApiResponse<T>(success.getHttpStatusCode(), true, data);
    }

    public static ApiResponse error(Error error) {
        return new ApiResponse<>(error.getHttpStatusCode(), false);
    }

    public static ApiResponse error(Error error, String message) {
        return new ApiResponse<>(error.getHttpStatusCode(), false);
    }
}

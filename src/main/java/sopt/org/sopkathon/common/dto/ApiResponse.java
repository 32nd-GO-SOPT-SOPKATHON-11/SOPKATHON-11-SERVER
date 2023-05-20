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
    private final String message;
    private T data;


    public static ApiResponse success(Success success) {
        return new ApiResponse<>(success.getHttpStatusCode(), true, "요청이 성공적으로 완료되었습니다.");
    }

    public static <T> ApiResponse<T> success(Success success, T data) {
        return new ApiResponse<T>(success.getHttpStatusCode(), true, "요청이 성공적으로 완료되었습니다.",data);
    }

    public static ApiResponse error(Error error) {
        return new ApiResponse<>(error.getHttpStatusCode(), false, "존재하지 않는 유저를 검색했습니다.");
    }

}

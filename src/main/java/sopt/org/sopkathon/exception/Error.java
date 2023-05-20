package sopt.org.sopkathon.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Error{
    /**
     * 500 INTERNAL SERVER ERROR
//     */
//    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR),
//
    /*
      404 NOT FOUND
     */
    NOT_FOUND_ERROR(HttpStatus.NOT_FOUND, "존재하지 않는 유저를 검색했습니다.");

    private final HttpStatus httpStatus;
    private final String message;
    public int getHttpStatusCode() {
        return httpStatus.value();
    }
}

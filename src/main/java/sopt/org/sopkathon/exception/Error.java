package sopt.org.sopkathon.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Error{
    ;

    private final HttpStatus httpStatus;

    public int getHttpStatusCode() {
        return httpStatus.value();
    }
}

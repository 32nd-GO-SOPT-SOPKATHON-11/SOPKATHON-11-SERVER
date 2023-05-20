package sopt.org.sopkathon.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor(access =  AccessLevel.PRIVATE)
public enum Success {

    /*
    user
     */
    USERS_FIND_SUCCESS(HttpStatus.OK),

    ;

    private final HttpStatus httpStatus;

    public int getHttpStatusCode() {
        return httpStatus.value();
    }
}

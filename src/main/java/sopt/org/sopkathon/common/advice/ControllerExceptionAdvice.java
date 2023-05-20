package sopt.org.sopkathon.common.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import sopt.org.sopkathon.common.dto.ApiResponse;
import sopt.org.sopkathon.exception.Error;
import sopt.org.sopkathon.exception.model.NotFoundException;

@RestControllerAdvice
public class ControllerExceptionAdvice {
    /*
    404 BAD REQUEST
     */
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    protected ApiResponse handleNotFoundException(final NotFoundException e){
        return ApiResponse.error(Error.NOT_FOUND_ERROR);
    }
}

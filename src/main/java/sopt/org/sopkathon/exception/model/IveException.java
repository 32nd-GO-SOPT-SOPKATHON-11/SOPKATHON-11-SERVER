package sopt.org.sopkathon.exception.model;

import lombok.Getter;
import sopt.org.sopkathon.exception.Error;

@Getter
public class IveException extends RuntimeException{
    private final Error error;

    public IveException(Error error, String message){
        super(message);
        this.error = error;
    }
}
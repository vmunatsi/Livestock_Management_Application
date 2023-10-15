package com.livestockmanagement.livestockAPP.exception;

public class FarmAlreadyExistException extends RuntimeException {

    public FarmAlreadyExistException(String message) {
        super(message);
    }

    public FarmAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }
}

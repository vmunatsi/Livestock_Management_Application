package com.livestockmanagement.livestockAPP.exception;

public class PaddockAlreadyExistException extends RuntimeException {
    public PaddockAlreadyExistException(String message) {
        super(message);
    }

    public PaddockAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }
}

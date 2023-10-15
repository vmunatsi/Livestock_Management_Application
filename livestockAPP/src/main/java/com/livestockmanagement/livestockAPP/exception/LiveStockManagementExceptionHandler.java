package com.livestockmanagement.livestockAPP.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class LiveStockManagementExceptionHandler {
    @ExceptionHandler(value = {FarmAlreadyExistException.class})
    public ResponseEntity<Object> handleFarmAlreadyExistException(FarmAlreadyExistException farmAlreadyExistException) {
        LiveStockManagementException liveStockManagementException = new LiveStockManagementException(farmAlreadyExistException.getMessage(), farmAlreadyExistException.getCause(), HttpStatus.FOUND);
        return new ResponseEntity<>(liveStockManagementException, HttpStatus.FOUND);
    }
    @ExceptionHandler (value = {ResourceNotFoundException.class})
    public ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException resourceNotFoundException){
        LiveStockManagementException liveStockManagementException = new LiveStockManagementException(resourceNotFoundException.getMessage(), resourceNotFoundException.getCause(), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(resourceNotFoundException, HttpStatus.NOT_FOUND);
    }
}

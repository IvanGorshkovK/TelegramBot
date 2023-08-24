package ru.botservice.telegbot.exception;

public class ServiceException extends Exception{
    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}

package com.ocp.day19_exception;

public class LoginFailException extends Exception {
    public LoginFailException(String errorMessage) {
        super(errorMessage);
    }
    
    public void howToDo() {
        System.out.println("請重新登入");
    }
}

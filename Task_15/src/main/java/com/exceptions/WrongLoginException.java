package com.exceptions;

import java.io.IOException;

public class WrongLoginException extends IOException {

    private String inputLogin;

    public WrongLoginException(String inputLogin) {
        this.inputLogin = inputLogin;
    }

    public WrongLoginException(String message, String inputLogin) {
        super(message);
        this.inputLogin = inputLogin;
    }

    public String beautifyLoginException() {
        return String.format("%s ,you entered this as a login : %s", getMessage(), inputLogin);
    }
}

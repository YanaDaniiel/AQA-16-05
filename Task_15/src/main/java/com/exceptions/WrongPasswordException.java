package com.exceptions;

import java.io.IOException;

public class WrongPasswordException extends IOException {

    private String inputPassword;

    public WrongPasswordException(String message, String inputPassword) {
        super(message);
        this.inputPassword = inputPassword;
    }

    public WrongPasswordException(String inputPassword) {
        this.inputPassword = inputPassword;
    }

    public String beautifyPassword() {
        return String.format("%s, you entered this as a password : %s", getMessage(), inputPassword);
    }
}

package com.utils;

import com.exceptions.WrongLoginException;
import com.exceptions.WrongPasswordException;

public class LoginUtils {

    public static boolean checkLogin(String login) throws WrongLoginException {
        if (login.contains("_") && login.length() < 20) {
            return true;
        } else {
            throw new WrongLoginException("The login is incorrect", login);
        }
    }

    public static boolean checkPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password.contains("_") && password.contains("!") && password.length() < 20
                && password.equals(confirmPassword)) {
            return true;
        } else {
            throw new WrongPasswordException("The password is incorrect or does not match the confirmPassword", password);
        }
    }

    public static boolean loginDataChecker(String login, String password, String confirmPassword) {
        try {
            return (checkLogin(login) && checkPassword(password, confirmPassword));
        } catch (WrongLoginException e) {
            System.out.println("WrongLoginException e");
            System.out.println(e.beautifyLoginException());
        } catch (WrongPasswordException e) {
            System.out.println("WrongPasswordException e");
            System.out.println(e.beautifyPasswordException());
        } catch (Exception e) {
            System.out.println("Exception e");
            System.out.println(e.getMessage());
        }
        return false;
    }
}

package com.capybara;

public class CapyBirthInfo {

    int day;
    String month;
    int year;

    public CapyBirthInfo(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String printBirthInfo() {
        return " Day: " + day + " Month: " + month + " Year: " + year;
    }
}

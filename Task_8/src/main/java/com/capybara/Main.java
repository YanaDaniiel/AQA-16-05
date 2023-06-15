package com.capybara;

public class Main {
    public static void main(String[] args) {

        CapyBirthInfo capyBirthInfo = new CapyBirthInfo(12, "April", 1996);
        Capybara capybara = new Capybara("Cappy", "male", capyBirthInfo, 3.5);
        capybara.printCapybara();
        System.out.println(capyBirthInfo.printBirthInfo());
        Capybara capybara1 = new Capybara("Sunny", "female");
        capybara1.printCapybaraFriend();
    }
}

package com.capybara;

public class Capybara {

    String name;
    String gender;
    CapyBirthInfo birthInfo;
    double weight;

    public Capybara(String name, String gender, CapyBirthInfo birthInfo, double weight) {
        this.name = name;
        this.gender = gender;
        this.birthInfo = birthInfo;
        this.weight = weight;
    }

    public Capybara(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void printCapybara() {
        System.out.println("Capy_name: " + name + "| Capy_gender:" + gender + "| Capy_birth_info : " + birthInfo.printBirthInfo() + "| Weight:" + weight);
    }

    public void printCapybaraFriend() {
        System.out.println(" Capy_friend: " + name + " Capy_friend_gender: " + gender);
    }
}

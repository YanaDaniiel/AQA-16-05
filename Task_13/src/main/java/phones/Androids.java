package phones;

import abstractions.Phone;
import abstractions.Smartphones;

public class Androids extends Phone implements Smartphones {

    private double phoneBalance; //how much money does the user have on their phone's balance
    private double callDuration;
    private int smsAmount;
    private double internetDuration;

    public Androids(String phoneNumber, double phoneBalance, double callDuration, int smsAmount, double internetDuration) {
        super(phoneNumber);
        setPhoneBalance(phoneBalance);
        this.callDuration = callDuration;
        this.smsAmount = smsAmount;
        this.internetDuration = internetDuration;
    }

    public void setPhoneBalance(double phoneBalance) {
        if (phoneBalance > 0) {
            this.phoneBalance = phoneBalance;
        } else {
            System.out.println("The user cannot call, send sms or pay for the Internet");
        }
    }

    public double getPhoneBalance() {
        return phoneBalance;
    }

    public double getCallDuration() {
        return callDuration;
    }

    public double getSmsAmount() {
        return smsAmount;
    }

    public double getInternetDuration() {
        return internetDuration;
    }

    @Override
    public String toString() {
        return "Android data { " +
                "Phone number ='" + getPhoneNumber() + '\'' +
                ", Phone balance ='" + getPhoneBalance() +
                ", Call duration ='" + getCallDuration() +
                ", SMS amount ='" + getSmsAmount() +
                ", Internet duration ='" + getInternetDuration() +
                '}';
    }

    @Override
    public double call(String phone, double phoneBalance, double callMinutePrice, double callDuration) {
        double remainder = phoneBalance - (callMinutePrice * callDuration);
        if (remainder >= 0) {
            return remainder;
        } else {
            return 0;
        }
    }

    @Override
    public double sms(String phone, double phoneBalance, double smsPrice, double smsAmount) {
        double remainder = phoneBalance - (smsPrice * smsAmount);
        if (remainder >= 0) {
            return remainder;
        } else {
            return 0;
        }
    }

    @Override
    public double internet(String phone, double phoneBalance, double internetMinutePrice, double internetDuration) {
        double remainder = phoneBalance - (internetMinutePrice * internetDuration);
        if (remainder >= 0) {
            return remainder;
        } else {
            return 0;
        }
    }
}

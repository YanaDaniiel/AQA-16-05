package abstractions;

public interface Smartphones {

    double call(String phone, double phoneBalance, double callMinutePrice, double callDuration);

    double sms(String phone, double phoneBalance, double smsPrice, double smsAmount);

    double internet(String phone, double phoneBalance, double internetMinutePrice, double internetDuration);
}

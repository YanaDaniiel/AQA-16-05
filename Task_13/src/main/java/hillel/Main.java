package hillel;

import tariff.Tariff;
import phones.iPhones;
import phones.Androids;

public class Main {
    public static void main(String[] args) {

        Tariff tariffAndroid = new Tariff(1.5, 1, 2);
        Tariff tariffIPhone = new Tariff(2.5, 1, 3);

        //callFromAndroid
        Androids android = new Androids("12345", 200, 5, 0, 0);
        System.out.println(android);
        System.out.println(android.call(android.getPhoneNumber(), android.getPhoneBalance(), tariffAndroid.getCallMinutePrice(), android.getCallDuration()));

        //send SMS from iPhone
        iPhones iPhone = new iPhones("54321", 200, 0, 3, 0);
        System.out.println(iPhone);
        double iPhoneBalanceRemainder = iPhone.sms(iPhone.getPhoneNumber(), iPhone.getPhoneBalance(), tariffIPhone.getSMSPrice(), iPhone.getSmsAmount());
        System.out.println(iPhoneBalanceRemainder);

        //connect to the Internet from iPhone
        iPhones iPhone1 = new iPhones("54321", iPhoneBalanceRemainder, 0, 0, 40);
        System.out.println(iPhone1);
        System.out.println(iPhone1.internet(iPhone1.getPhoneNumber(), iPhone1.getPhoneBalance(), tariffIPhone.getInternetMinutePrice(), iPhone1.getInternetDuration()));
    }
}

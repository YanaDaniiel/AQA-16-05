package tariff;

public class Tariff {
    private double callMinutePrice;
    private double smsPrice;
    private double internetMinutePrice;

    public Tariff(double callMinutePrice, double smsPrice, double internetMinutePrice) {
        setCallMinutePrice(callMinutePrice);
        setSmsPrice(smsPrice);
        setInternetMinutePrice(internetMinutePrice);
    }

    public void setCallMinutePrice(double callMinutePrice) {
        if (callMinutePrice > 0) {
            this.callMinutePrice = callMinutePrice;
        } else {
            System.out.println("Call price per minute cannot be equal to 0");
        }
    }

    public double getCallMinutePrice() {
        return callMinutePrice;
    }

    public void setSmsPrice(double smsPrice) {
        if (smsPrice > 0) {
            this.smsPrice = smsPrice;
        } else {
            System.out.println("SMS price cannot be equal to 0");
        }
    }

    public double getSMSPrice() {
        return smsPrice;
    }

    public void setInternetMinutePrice(double internetMinutePrice) {
        if (internetMinutePrice > 0) {
            this.internetMinutePrice = internetMinutePrice;
        } else {
            System.out.println("Internet per minute price cannot be equal to 0");
        }
    }

    public double getInternetMinutePrice() {
        return internetMinutePrice;
    }

    @Override
    public String toString() {
        return "Override: Tariff data { " +
                "Call minute price ='" + getCallMinutePrice() + '\'' +
                ", SMS price ='" + getSMSPrice() +
                ", Internet minute price ='" + getInternetMinutePrice() +
                '}';
    }
}

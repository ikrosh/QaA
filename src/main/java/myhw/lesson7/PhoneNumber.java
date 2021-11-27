package myhw.lesson7;

public class PhoneNumber {
    private String countryCode;
    private String number;

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String  toString() {
        return getCountryCode() + " " + getNumber();
    }
 }

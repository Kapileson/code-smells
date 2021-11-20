package ccouplers.feature_envy.bad_code;

public class PhoneNumberFormatter {
    private final String phoneNumber;

    public PhoneNumberFormatter(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAreaCode() {
        return phoneNumber.substring(0,3);
    }

    public String getPrefix() {
        return phoneNumber.substring(3,6);
    }

    public String getNumber() {
        return phoneNumber.substring(6,10);
    }
}

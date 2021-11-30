package ccouplers.feature_envy.clean_code;

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

    public String formatPhoneNumber(){
        return "(" + getAreaCode() + ") " + getPrefix() + "-" + getNumber();
    }
}

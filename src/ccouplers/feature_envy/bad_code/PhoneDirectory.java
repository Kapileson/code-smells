package ccouplers.feature_envy.bad_code;

import java.util.*;

class PhoneDirectory {

    private String personName;
    private PhoneNumberFormatter number ;
    Map<String, String> directory = new HashMap<>();

    public PhoneDirectory(String personName, String number) {
        this.number = new PhoneNumberFormatter(number);
    }

    public void addPhoneDirectory() {
        String formattedPhoneNumber = "(" + number.getAreaCode() + ") " + number.getPrefix() + "-" + number.getNumber();
        directory.put(personName, formattedPhoneNumber);
    }
}

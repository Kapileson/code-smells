package ccouplers.feature_envy.clean_code;

import java.util.HashMap;
import java.util.Map;

class PhoneDirectory {

    private String personName;
    private PhoneNumberFormatter phoneNumberFormatter ;
    Map<String, String> directory = new HashMap<>();

    public PhoneDirectory(String personName, String number) {
        this.phoneNumberFormatter = new PhoneNumberFormatter(number);
    }

    public void addPhoneDirectory() {
        directory.put(personName, phoneNumberFormatter.formatPhoneNumber());
    }
}

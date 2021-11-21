package a_dispensables.comments.clean_code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddressValidator {

    /*Pattern to validate valid email address.
    Example; demo@demo.com || demo@demo.net */
    final String EMAIL_ADDRESS_PATTERN = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\\\.[(com)|(net)]{2,6}$";

    public boolean isValidEmailAddress(String emailAddress) {
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
        Matcher matcher = pattern.matcher(emailAddress);
        return matcher.matches();
    }
}

package a_dispensables.comments.clean_code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddressValidator {

    /*Pattern to validate valid email address.
    Example; demo@demo.com */
    final String EMAIL_ADDRESS_PATTERN = "^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$";

    public boolean isValidEmailAddress(String emailAddress) {
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
        Matcher matcher = pattern.matcher(emailAddress);
        return matcher.matches();
    }
}

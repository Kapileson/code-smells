package a_dispensables.comments.bad_code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    /*Pattern to validate valid email address.
    Example; demo@demo.com */
    private String strRegexPattern = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\\\.[(com)]{2,6}$";

    /*
        This method is to validate email address
        @param strEmailAddress - email address to validate
        @return boolean - Is valid email or not
     */
    public boolean validate(String strEmailAddress){

                Pattern pattern = Pattern.compile(strRegexPattern);
            Matcher matcher = pattern.matcher(strEmailAddress);
        //condition to check if valid
        if(matcher.matches()){
                    return true;
        }else{
                return false;
        }
    }

}

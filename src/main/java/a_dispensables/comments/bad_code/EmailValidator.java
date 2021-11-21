package a_dispensables.comments.bad_code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    private String strRegexPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$";

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

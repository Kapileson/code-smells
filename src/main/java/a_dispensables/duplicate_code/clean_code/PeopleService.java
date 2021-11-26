package a_dispensables.duplicate_code.clean_code;

import java.util.Arrays;
import java.util.List;

public class PeopleService {

    List<String> personNames = Arrays.asList("Don", "John", "Kent");

    public String findPerson(String[] people){
        for (int i=0; i < personNames.size(); i++) {
            try{
                if (personNames.contains(people[i])) {
                    return people[i];
                }
            } catch (NullPointerException e){
                e.printStackTrace();
            }
        }
        return "Not Found";
    }
}

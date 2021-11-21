package a_dispensables.duplicate_code.clean_code;

import java.util.Arrays;
import java.util.List;

public class PeopleService {

    List<String> people = Arrays.asList(new String[] {"Don", "John", "Kent"});

    public String findPerson(String[] people){
        for (int i=0; i < this.people.size(); i++) {
            if (this.people.contains(people[i])) {
                return people[i];
            }
        }
        return "Not Found";
    }
}

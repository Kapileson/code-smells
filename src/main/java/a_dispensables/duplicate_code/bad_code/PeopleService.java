package a_dispensables.duplicate_code.bad_code;

public class PeopleService {

    private String personName;

    public PeopleService(String personName) {
        this.personName = personName;
    }

    public String findPerson(String[] people, int age){
        
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")){
                return "Don";
            }
            if (people[i].equals("John")){
                return "John";
            }
            if (people[i].equals("Kent")){
                return "Kent";
            }
        }
        return "Not Found";
    }

    private String toLowerCase(String name){
            return name.toLowerCase();
    }
}

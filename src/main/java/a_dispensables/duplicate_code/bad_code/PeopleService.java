package a_dispensables.duplicate_code.bad_code;

public class PeopleService {

    private String personName;

    public PeopleService() {}

    public String findPerson(String[] people, int age){

        for (String person : people) {
            try{
                if (person.equals("Don")) {
                    return "Don";
                }
                if (person.equals("John")) {
                    return "John";
                }
                if (person.equals("Kent")) {
                    return "Kent";
                }
            }catch (NullPointerException e){
                e.printStackTrace();
            }catch (ArithmeticException e){
                e.printStackTrace();
            }
        }
        return "Not Found";
    }

    private String toLowerCase(String name){
        return name.toLowerCase();
    }
}

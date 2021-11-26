package b_bloaters.large_class.clean_code;

public class Student {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String address;

    Student(String firstName,String lastName,String address,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

}



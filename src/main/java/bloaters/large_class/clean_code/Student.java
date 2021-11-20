package bloaters.large_class.clean_code;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

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



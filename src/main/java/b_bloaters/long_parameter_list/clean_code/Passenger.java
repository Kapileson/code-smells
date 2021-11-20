package b_bloaters.long_parameter_list.clean_code;

public class Passenger {


    private String name;
    private int age;

    public Passenger(String from, String to, String name, int age) {

        this.name = name;
        this.age = age;
    }


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

}

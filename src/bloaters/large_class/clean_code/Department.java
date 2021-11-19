package bloaters.large_class.clean_code;

public class Department {
    private String dept;

    public Department(String dept) {
        this.dept=dept;
    }

    public void addDepartment(int admissionNumber){
        switch (dept){
            case "CSE":{
                System.out.println(admissionNumber+ " Added to CSE");
                break;
            }
            case "ECE":{
                System.out.println(admissionNumber+ " Added to ECE");
                break;
            }
            case "EEE":{
                System.out.println(admissionNumber+ " Added to EEE");
                break;
            }
        }
}

    public String getDepartment() {
           return this.dept;
    }
    }

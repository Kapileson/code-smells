package b_bloaters.large_class.clean_code;

public class Department {
    private String department;

    public Department(String department) {
        this.department=department;
    }

    public void addDepartment(int admissionNumber){
        switch (department){
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
           return this.department;
    }
    }

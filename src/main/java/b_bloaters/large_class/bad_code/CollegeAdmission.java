package b_bloaters.large_class.bad_code;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

class CollegeAdmission {

    private String firstName;
    private String lastName;
    private String department;
    private int age;
    private String emailAddress;
    private long phoneNumber;


    public CollegeAdmission(String firstName, String lastName, int age, String emailAddress, long phoneNumber, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.age = age;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public void createAdmission(){

        Fees fee = new Fees(firstName);
        boolean feesPaidStatus = fee.isPaid();
        if(feesPaidStatus){

            int admissionNumber = new Random().nextInt();
            System.out.println("Admission number is: "+admissionNumber);

            addDepartment(admissionNumber,department);

            String fileName = this.firstName + this.lastName+".txt";
            try(FileWriter writer = new FileWriter(fileName)){
                writer.write("firstname lastName age dept emailAddress phoneNumber");
                writer.write("\n");
                writer.write(this.firstName+" "+this.lastName+" "+this.age+" "+this.department+" "+this.emailAddress+" "+this.phoneNumber);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Student details added");
        }else{
            System.out.println("Fees not paid, unable to add student in database");
        }
    }

    private void addDepartment(int admissionNumber,String dept){
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




}

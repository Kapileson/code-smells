package bloaters.large_class.clean_code;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

class CollegeAdmission {

    private Student student;
    private Department dept;


    public CollegeAdmission(Student student, String dept) {
        this.student = student;
        this.dept = new Department(dept);
    }

    private int getAdmissionNumber(){
        int admissionNumber = new Random().nextInt();
        System.out.println("Admission number is: "+admissionNumber);
        return admissionNumber;
    }

    public void createAdmission(){
        Fees fee = new Fees(student.getFirstName());
        if(fee.isPaid()){
            dept.addDepartment(getAdmissionNumber());
            new StoreAdmissionDetails().StoreDetails(student, dept);
        }else{
            System.out.println("Fees not paid, unable to add student in database");
        }
    }






}

package b_bloaters.large_class.clean_code;

import java.util.Random;

class CollegeAdmission {

    private Student student;
    private Department department;


    public CollegeAdmission(Student student, String department) {
        this.student = student;
        this.department = new Department(department);
    }

    private int getAdmissionNumber(){
        int admissionNumber = new Random().nextInt();
        System.out.println("Admission number is: "+admissionNumber);
        return admissionNumber;
    }

    public void createAdmission(){
        Fees fee = new Fees(student.getFirstName());
        if(fee.isPaid()){
            department.addDepartment(getAdmissionNumber());
            new StoreAdmissionDetails().StoreDetails(student, department);
        }else{
            System.out.println("Fees not paid, unable to add student in database");
        }
    }






}

package b_bloaters.large_class.clean_code;

import java.util.Random;

class CollegeAdmission {

    private final Student student;
    private final Department dept;


    public CollegeAdmission(Student student, Department dept) {
        this.student = student;
        this.dept = dept;
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

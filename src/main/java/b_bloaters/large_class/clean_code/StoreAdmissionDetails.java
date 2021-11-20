package b_bloaters.large_class.clean_code;

import java.io.FileWriter;
import java.io.IOException;

public class StoreAdmissionDetails {

    public void StoreDetails(Student student,Department dept){
        String fileName = student.getFirstName() + student.getLastName()+".txt";
        try(FileWriter writer = new FileWriter(fileName)){
            writer.write("firstname lastName age dept emailAddress phoneNumber");
            writer.write("\n");
            writer.write(student.getFirstName()+" "+student.getLastName()+" "+student.getAge()+" "+dept.getDepartment()+" "+student.getAddress());
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        System.out.println("Student details added");
    }

}

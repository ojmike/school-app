package Services.ServiceImplementation;

import Services.StudentTakesCourse;
import model.Person;

public class StudentTakesCourseImplementation implements StudentTakesCourse {

    public void studentTakesCourse(Person student , Person teacher){

        if(student.getStudentStatus() != null && student.getStudentStatus().equals("Student")){
            System.out.println(student.getName() + " can take teacher " + teacher.getName() + " class.");
        }else{
            System.out.println("You are not our student");
        }

    }
}

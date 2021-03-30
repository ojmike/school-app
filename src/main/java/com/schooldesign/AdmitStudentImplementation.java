package com.schooldesign;

public class AdmitStudentImplementation implements AdmitStudent {
    Person principal = new Person();
    Person student = new Person();

    public void admitStudent(Person principal, Person student) {
        if (principal.getLevel() != null && principal.getLevel().equals("Principal")) {

            if (student.getStudentStatus() != null && student.getStudentStatus() == "Applicant" && student.getAge() >= 13 ) {

                System.out.println(student.getName() + " has been offered admission into the school");

            } else if(student.getStudentStatus() != null && student.getStudentStatus().equals("Applicant") && student.getAge() < 13){
                System.out.println(student.getName() + " is below the age requirement for admisson into the school");
             }else{
                System.out.println("You have not applied for admission in our School");
            }



        }else
        { System.out.println(" Only the Principal can admit students");
        }

    }
}




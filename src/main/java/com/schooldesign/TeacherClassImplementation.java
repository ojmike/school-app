package com.schooldesign;

public class TeacherClassImplementation implements TeacherTask {


  // private Person teacher = new Person();


    public void teach( Person teacher){

        if(teacher.getLevel() != null && teacher.getLevel().equals("Academic Staff")){
            System.out.println("Go and teach a course ");
        }else{
            System.out.println("You are unauthorized to teach a class");
        }

    }


}

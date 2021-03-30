import Services.ServiceImplementation.AdmitStudentImplementation;
import model.Person;
import Services.ServiceImplementation.StudentTakesCourseImplementation;
import Services.ServiceImplementation.TeacherClassImplementation;

public class Main extends Person {

    public Main(String name, int age, String level, String maritalStatus, double salary) {
        super(name, age, level, maritalStatus, salary);
    }


    public static void main(String[] arg){

        Person teacher = new Person("Adeyemi",22,"Academic Staff","Single", 20000);
        Person student = new Person("Kolade",12,"Single","Student");
        Person principal = new Person("Amaechi",56,"Principal","Married",890000);
        Person applicant = new Person("Adesola",10,"Single","Applicant");
        TeacherClassImplementation teacherClassImplementation = new TeacherClassImplementation();
        //teacherClassImplementation.teach(principal);
        AdmitStudentImplementation admitStudentImplementation = new AdmitStudentImplementation();
       admitStudentImplementation.admitStudent(teacher, student );

       StudentTakesCourseImplementation studentTakesCourseImplementation = new StudentTakesCourseImplementation();
       studentTakesCourseImplementation.studentTakesCourse(student, teacher);

    }




}



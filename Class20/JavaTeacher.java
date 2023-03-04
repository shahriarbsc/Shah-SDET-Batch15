package Class20;

public class JavaTeacher extends TeacherHW {

    void code(){

        System.out.println("JAVA teacher teaches how to code");
    }

    public static void main(String[] args) {

        JavaTeacher java= new JavaTeacher();

        java.teacherName="Asel";
        java.teacherId="A67";

        java.homework(); // public
        java.grade(); // protected
        java.scholarship(); // default

// java.extraPoint




    }



}

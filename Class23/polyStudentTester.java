package Class23;

public class polyStudentTester {
    public static void main(String[] args) {


        polyStudent[] students = {new CollegeStudent(), new SyntaxStudent(), new SchoolStudent()};

        for (polyStudent student : students) {

            student.doHomeWork();
            student.practice();
            student.study();
        }


    }

}

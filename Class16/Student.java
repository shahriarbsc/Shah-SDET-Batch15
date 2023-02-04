package Class16;

public class Student {

    String name;
    String id;
    static String schoolName;
    int age;
    double weight;

    void printName() {// instance method

        int SSN = 1345454354;

        System.out.println(name);
        System.out.println(schoolName);


      //  static void printStudentInfo () {         // static method

            //  System.out.println(name);  / cant access here
            System.out.println(schoolName);

        }

    }




package Class17;

/*
Write a student class that have instance variables name and address. Create a constructor that will initialize those variables.

Print name & address of the displayed method

*/
public class Class17HW5Student {


    String name;
    String address;

    Class17HW5Student(String studentName, String studentAddress){
        name=studentName;
        address=studentAddress;
    }
    void printInfo(){
        System.out.println("Student's name is "+name+" and Student's Address is "+address);
    }
}











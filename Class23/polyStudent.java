package Class23;


    //Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    //Define common behavior within parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Write example of achieving run time polymorphism

public class polyStudent {
    public void study(){
        System.out.println("studying.... ");
    }
    void doHomeWork(){
        System.out.println("Solving homeworks");
    }
    void practice(){
        System.out.println("practicing the skills");
    }
}

class SyntaxStudent extends polyStudent{

    @Override
    public void study() {
        System.out.println("Syntax Student must study Programming");
    }

    @Override
    void doHomeWork() {
        System.out.println("Syntax Students must solve the homeworks before next class");
    }

    @Override
    void practice() {
        System.out.println("Syntax Student must practice Repls");
    }
}

class  CollegeStudent extends polyStudent{
    @Override
    void practice() {
        System.out.println("College studetns must practice to get good grades");
    }
}

class SchoolStudent extends polyStudent{

}



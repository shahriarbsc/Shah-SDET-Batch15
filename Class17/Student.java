package Class17;
public class Student {

    //Create a class call it Student define 4 instance field like id,Name, age,weight.

    //Create 5 objects of the class do this task without constructors and with constructors

   String id;
   String name;
   int age;
  double weight;

    public Student(String sName,String sId, int sAge){

        id=sId;
        name=sName;
        age=sAge;

    }

    public Student(String sName,String sId, int sAge, double sWeight){

    id=sId;
    name=sName;
    age=sAge;
    weight=sWeight;

  }
  void printInfo(){

    System.out.println(name+" "+id+ " "+age+" "+weight);

  }
  }









package Class19;

public class Donkey {

    String name;
    int age;
    double weight;

    //non argument constructors
   /* Donkey(){
        System.out.println("This is non argument constructors");
    }
    */

    Donkey(String name, int age) {

       this.name = name;   //right (name) is your local variable and left is your instance
       this.age = age;

    }

    void print() {

        System.out.println("Donkey`s name is " + name + " age is " + age + " and weight is " + weight);
    }

}

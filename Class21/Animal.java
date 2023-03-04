package Class21;

public class Animal {
    String name;
    String color = "Black";

}

class Cat extends Animal {

    //String color = "white"; // by default java prefer child class variables or closest one
    int age=10;
    double weight;

    void printColor() {
      //  String color = "Blue";

        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);  // parent class
    }
}

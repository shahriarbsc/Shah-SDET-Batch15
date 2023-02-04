package Class16;

public class Task4 {

    /*4)Create a method that will say Hello in different language based on the country that will passed when method is executed

        //return type=String & void
        //method name- sayHello
        // parameter= only 1 parameter -String countryName
    */
    String sayHello(String countryName) {

        switch (countryName) {

            case "USA":
                return "Hello";  // Break is not needed
            case "Kazakhstan":
                return "Salem";
            case "Italy":
                return "Ciao";
            case "China":
                return "Ni hao";
            default:
                return "Country not supported";
        }
       // System.out.println(" i will get an error");

    }

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        System.out.println(task4.sayHello("USA"));

    }

}

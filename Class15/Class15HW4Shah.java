package Class15;

public class Class15HW4Shah {

//4)Create a method that will say Hello in different language based on the country that will passed when method is executed

    //return type=String
    //method- HelloByCountry
    // parameter=

    String HelloByCountry(String country) {
        switch (country.toString()) {
            case "Pakistan":
                return "Salam";

            case "USA":
                return "Hello";

            case "Bangladesh":
                return "As Salamu Alaikum";

            case "India":
                return "Pronam";

            case "Mexico":
                return "Ola";

            default:
                return "Unknown Country";

        }
    }

    public static void main(String[] args) {
        Class15HW4Shah shah4 = new Class15HW4Shah();
        System.out.println(shah4.HelloByCountry("Bangladesh"));
    }
}
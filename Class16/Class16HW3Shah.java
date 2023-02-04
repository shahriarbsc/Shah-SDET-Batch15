package Class16;

public class Class16HW3Shah {


    //return type = String
    // name of the method = getonlyVowels
    //parameters = String inputStr
    public static void main(String[] args) {

        System.out.println(getOnlyVowels("java"));

    }

    private static String getOnlyVowels(String inputStr) {

//AEIOU aeiou
        // Asghar = Aa

        return inputStr.replaceAll("[^AEIOUYaeiou]", "");


    }
}











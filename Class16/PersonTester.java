package Class16;

import java.util.Scanner;

public class PersonTester {
    public static void main(String[] args) {


        Person person = new Person();

        // System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);
        person.printSSN();
        person.printTikTokAccount();
//person.printPassword(); because its private


    }


}

package Class28;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Class28HW6Insurance {

  /* 6) Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
          Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
          Create 3 objects of the sub classes and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.
     */

        public static final String insuranceName = "Progresive";
        public abstract void getQuote ();
        public abstract void cancelInsurance ();
    }

    class Car extends Class28HW6Insurance {
        String carModel;

        public Car(String carModel) {
            this.carModel = carModel;
        }

        @Override
        public void getQuote() {
            System.out.println("Car insurance is $300 monthly");

        }

        @Override
        public void cancelInsurance() {
            System.out.println("You can cancel your insurance with a one month notice prior to cancellation");

        }
    }

    class Pet extends Class28HW6Insurance {
        String petType;

        public Pet(String petType) {
            this.petType = petType;
        }

        @Override
        public void getQuote() {
            System.out.println("Pet insurance is $150 monthly");

        }

        @Override
        public void cancelInsurance() {
            System.out.println("You can give 4 days notice prior your cancellation");

        }
    }

    class Health extends Class28HW6Insurance {
        @Override
        public void getQuote() {
            System.out.println("Health insurance is $250 monthly");

        }

        @Override
        public void cancelInsurance() {
            System.out.println("You can cancel your insurance one month prior cancellation");

        }
    }
 class Class28HW6InsuranceTester {
    public static void main(String[] args) {


        ArrayList<Class28HW6Insurance> insurances = new ArrayList<>();
        insurances.add(new Car("Camry"));
        insurances.add(new Pet("Dog"));
        insurances.add(new Health());

        for (int i = 0; i < insurances.size(); i++) {
            System.out.println(Class28HW6Insurance.insuranceName);
            insurances.get(i).getQuote();
            insurances.get(i).cancelInsurance();
            System.out.println("____________________");
        }

        for (Class28HW6Insurance company : insurances) {
            System.out.println(Class28HW6Insurance.insuranceName);
            company.getQuote();
            company.cancelInsurance();
            System.out.println("_____________________");
        }
        Iterator<Class28HW6Insurance> iterator = insurances.iterator();
        while (iterator.hasNext()) {
            System.out.println(Class28HW6Insurance.insuranceName);
            Class28HW6Insurance i = iterator.next();
            i.getQuote();
            i.cancelInsurance();
        }
    }

}
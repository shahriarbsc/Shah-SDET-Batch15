package Class27;

public class Demo2 {
    public static void main(String[] args) {

        String name = "Urwa";

        String[] names = {"Heral", "Nima", "Laura", "Nat"};
        System.out.println(contains(name, names));

        String []arr=new String[20000];


        names[4]="Shah";



    }
// Create a method which can search a name from this array return true if the name is present

    public static Boolean contains(String nameToBeSearched, String[] names) {

        for (String name : names) {

            if (nameToBeSearched.equals(name)) {

                return true;
            }
        }

        return false;

    }

}






package class7;

public class Class7HW1 {
    public static void main(String[] args) {

        boolean workDay = true;
        for (int day = 1; day <= 6; day++) {
            if (day < 6) {
                System.out.println("I need a day off");
            } else {
                System.out.println("I don't need a day off anymore");
            }
        }
    }

}

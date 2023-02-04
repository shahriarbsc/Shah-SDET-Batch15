package Class17;
import Class16.Students;
public class HW2Students {
        private String name;
        private double grade1;
        private double grade2;
        private double grade3;

        public HW2Students(String studentName, double subject1, double subject2, double subject3) {
            name = studentName;
            grade1 = subject1;
            grade2 = subject2;
            grade3 = subject3;
        }

        public double calculateAverage() {
            return (grade1 + grade2 + grade3) / 3;
        }

   public static void main(String[] args) {
            HW2Students student1 = new HW2Students("John", 80, 70, 90);
            HW2Students student2 = new HW2Students("Jane", 60, 80, 70);
            HW2Students student3 = new HW2Students("Jim", 90, 90, 80);
            HW2Students student4 = new HW2Students("Jack", 70, 60, 50);
            HW2Students student5 = new HW2Students("Jill", 80, 80, 80);

            System.out.println(student1.name + "'s average grade is " + student1.calculateAverage());
            System.out.println(student2.name + "'s average grade is " + student2.calculateAverage());
            System.out.println(student3.name + "'s average grade is " + student3.calculateAverage());
            System.out.println(student4.name + "'s average grade is " + student4.calculateAverage());
            System.out.println(student5.name + "'s average grade is " + student5.calculateAverage());
        }
    }








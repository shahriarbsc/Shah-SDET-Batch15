package Class16;

public class SyntaxEmployee {
    String empId;
    double salary;
    String CEO="Sumair"; // is going to be same we create this one is static

    public static void main(String[] args) {

        SyntaxEmployee emp1=new SyntaxEmployee();

        emp1.empId="s123";
        emp1.salary=100000;


        SyntaxEmployee emp2=new SyntaxEmployee();

        emp1.empId="s124";
        emp1.salary=120000;


        System.out.println(emp1.empId);
        System.out.println(emp1.salary);
        System.out.println(emp1.CEO);

    }

    }




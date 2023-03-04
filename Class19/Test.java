package Class19;

public class Test {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();

        ba.accountNumber = 76758751;
        ba.money = 1000;
        ba.deposit();


        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

// ba.transfer ()


        System.out.println("----Creating an Object of checking account");


        Checking check = new Checking();
        // features from parent

        check.accountNumber = 5765;

        check.money = 780;
        // features from checking class itself;

        check.interest = 0;

        check.deposit();  // from parent
        check.transfer();  // from child

        System.out.println("----Creating an Object of checking account");

        Savings save = new Savings();
        save.accountNumber = 8776166;
        save.money = 7657;
        save.profit = 100;
        // save.interest=0; siblings features are not available

        save.deposit();
        save.takeProfit();
        //save.transfer(); not available


    }
}

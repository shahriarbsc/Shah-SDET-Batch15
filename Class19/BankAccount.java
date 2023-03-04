package Class19;

public class BankAccount {  // parent class/super class/base class
    long accountNumber;
    double money;


    void deposit() {
        System.out.println("Deposit methods from Bank account class");
    }

}

class Checking extends BankAccount {  // child class/sub class/derived class


    double interest;

    void transfer() {

        System.out.println("transfer method from checking class");
    }
}
    class Savings extends BankAccount {

        double profit;

        void takeProfit() {

            System.out.println("Profit method from Savings class");
        }
    }
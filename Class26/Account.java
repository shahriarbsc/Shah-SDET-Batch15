package Class26;

public class Account {
   private double balance;
   private String accountNumber;
   private String type;
   private String accountTitle;

public void setBalance(double balance){

    // sanitizing the input meaning the values before we can assign them

if(balance<0){

    System.out.println("Negative is not allowed its a current account");

}else{

    this.balance=this.balance+balance;

}

}

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance(){

    return balance;

}

   public String getAccountTitle(){

       return accountTitle;
   }


    public Account(double balance, String accountNumber, String type, String accountTitle) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.type = type;
        this.accountTitle = accountTitle;
    }
}

class AccountTester {

    public static void main(String[] args) {

        Account account = new Account(-1000, "khsgmmdk", "kjsih", " kjkhs");

        System.out.println(account.getAccountTitle());
    }
}
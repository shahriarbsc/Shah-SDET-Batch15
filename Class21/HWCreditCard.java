package Class21;
public class HWCreditCard {

  /* Create a class CreditCard and define variable balance and interest.
        Create an instance method that will calculate interest based on the given balance.
        Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
        Call the method by creating an object of each of the three classes.*/

    double balance;
    double interest;

    double calculateInterest(double balance,double interest){
        return balance *(interest/100);
    }
}
class Visa extends HWCreditCard{

}
class AX extends HWCreditCard{
    @Override
    double calculateInterest(double balance, double interest) {
        return super.calculateInterest(balance,interest)+10;
    }
}
class CreditCardTester{

    public static void main(String[] args) {

        HWCreditCard creditCard=new HWCreditCard();
        System.out.println(creditCard.calculateInterest(1500,6.5));

        Visa visa=new Visa();
        System.out.println(visa.calculateInterest(500,4.5));

        AX ax=new AX();
        System.out.println(ax.calculateInterest(2500,3.5));

    }
}










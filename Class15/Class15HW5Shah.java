package Class15;

public class Class15HW5Shah {

    //5) Write a method to return whether given number is prime or not?
    //return type=int
    //method- isPrime
    // parameter=

    boolean isPrime(int num) {
        boolean flag = true;
        if (num<=1){
            flag=false;
        }else if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Class15HW5Shah shah5 = new Class15HW5Shah();
        int num=3;
        System.out.println(num+" is prime? "+ shah5.isPrime(num));


    }
}
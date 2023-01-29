package Class15;

public class MethodPractice {


    //Create a method which returns true or false and take the int numbers
    //as a parameter if number is even it returns true otherwise it returns false


    boolean isEven(int numbers) {
        boolean flag;
        if (numbers % 2 == 0) {
            flag = true;

        } else {
            flag = false;

        }
        return flag;
    }
}
/*
    boolean isEven1(int numbers) {
        if (numbers % 2 == 0) {

        } else {

            return false;
        }


        boolean isEven2 ( int numbers){
            return numbers % 2 == 0;

        }

    }
}*/
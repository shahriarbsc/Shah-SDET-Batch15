package Class17;

/*
Write a java class that have 4 constructors with 4 different access levels of constructors(private, public
default, protected) and create 4 objects of this class- from outside the class;3
from different class inside different package and observe result.

*/
public class Class17HW3 {

    private  Class17HW3(){
        System.out.println("Constructor without any parameter");
    }

    Class17HW3(String name){
        System.out.println("Constructor with a String as parameters");
    }
    protected Class17HW3(int number){
        System.out.println("Constructor with an int as parameter");
    }

    public Class17HW3(char c){
        System.out.println("Constructor with a char as parameter");
    }


    public static void main(String[] args) {
        Class17HW3 hm1=new Class17HW3();

    }
}










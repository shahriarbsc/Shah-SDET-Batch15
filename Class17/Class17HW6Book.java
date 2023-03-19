package Class17;

/*
Write Book class that will have instance variables name and 2 constructors. While creating an object
make sure: Instance variables are being initialized
Both constructors are being executed.

*/
public class Class17HW6Book {

    String name;
    String colour;
    int price;

    Class17HW6Book(String bookName, String bookColour){
        name=bookName;
        colour=bookColour;
    }
    Class17HW6Book(String bookName, String bookColour, int bookPrice){
        this(bookName,bookColour);
        price=bookPrice;
    }
    void printInfo(){
        System.out.println("The name of the book is "+name+", it's colour is "+colour+" and the price is "+price);
    }
}











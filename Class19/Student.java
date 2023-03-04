package Class19;

public class Student {


            String name;

            int price;
            int add;
/*
            Book(String name, int price, int pages){
                this.name = name;
                this.price = price;
                this.pages = pages;
            }
            Book(String name, String author, int price, int pages){
                this(name, price, pages);
                this.author = author;
            }

            public static void main (String[]args){
                Book book1 = new Book("Atomic habits", 20, 298);
                Book book2 = new Book("The Gift", "Edith Eger", 23, 256);
                System.out.println(book2.name);
            }
        }
    */
    public Student(String name, String add) {
    }

    void displayInfo(String name, int add) {
        this.name = name;
        this.add = add;
    }

    void displayInfo() {
        System.out.println("the name is " + name + "and the address is " + add);
    }

    public static void main(String[] args) {
        Student student = new Student("hameed", "585");
        student.displayInfo();

    }
}

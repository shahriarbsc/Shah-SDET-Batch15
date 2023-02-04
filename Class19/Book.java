package Class19;
public class Book {

/*    String author;
    String title;
    int year;


    Book(String author, String title) {
        this.author=author;
        this.price = price;

    }

    Book(String name, String author) {
        this.name = name;
        this.author = author;

    }

    void info() {

        System.out.println(Author:" + author + ",Title: " + title + ", published: " + year);

    }

    public static void main(String[] args) {

Book book = new Book( )
    }
}
*/
String name;

        String author;

        int year;

        Book(String name, String author){
        this.name= name;
        this.author= author;
        }

        Book(String name, String author, int year){
        this(name, author);
        this.year= year;
        }

        void printBookInfo(){
        System.out.println("Book Name: "+name+" Author Name: "+author+" Year of Publishes: "+year);
        }
        }

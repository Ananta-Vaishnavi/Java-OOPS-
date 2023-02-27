// Program to implement a Book class that stores the details of a book such as its code, title
// and price (Use constructors to initialize the objects).
import java.util.*;
class Book
{
    String code;
    String title;
    double price;

    void Book(String code, String title, double price)
    {
        this.code = code;
        this.title = title;
        this.price = price;
    }

}
class Library{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the code of the book");
       String code = sc.nextLine();
       System.out.println("Enter the title of the book");
       String title = sc.nextLine(); 
       System.out.println("Enter the price of the book");
       double price = sc.nextDouble();
       Book b = new Book(code, title, price);
    }
}

/** Laboratory 5 Worked Example, application class */
//imports the java support class Scanner
import java.util.Scanner;
public class BookShopApp{
   public static void main(String[] args){
      /** Accesses the java library (Support Class) method Scanner,
      *Thats why we import the support class at the top.
      *We must declare a new variable to call the Scanner.
      */
      //Creates a Scanner object
      Scanner scan = new Scanner(System.in);
      //Gives the user a prompt
      System.out.println("What your name?");
      //Uses the Scanner method to scan the users next line input
      String name = scan.nextLine();
   	//make a new instance of the book class
      /*
      *The below statement decalres a new variable "book1" and it is of type "Book".
      *Therefore it is of type "Book" and is variable/object "book1", Book book1 =. 
      * In this statment you must declare a new instance of "Book".
      *e.g. new Book("Hobby", "Lester", 2002, 157), here the new is called by type Book,
      *creating an instance of Book that is new, note no data types needed e.g.int,String,double,etc.
      */		
      Book book1 = new Book("Potiki", "Patricia Grace", 1986, 27 );
      Book book2 = new Book("Potiki", "Patricia Grace", 1986, 30 );
      Book book3 = new Book("The Luminaries", "Eleanor Catton", 2013, 28.5);
      Book book4 = new Book();
      Book book5 = new Book("Kaitangata Twitch", "Margaret Mahy", 2005);
      /**Calls the mutator method "setPrice()" from the support class Book, 
      to update the objects price e.g. book1.setPrice(30);
      this calls the mutator method and updates variable book1's price to $30**/
      book2.setPrice(40);
      book5.setPrice(30);
   	//display what the object's toString method returns  
      book1.displayBook(); 
      book2.displayBook(); 
      book3.displayBook();
      book4.displayBook();
      book5.displayBook(); 
      //Calls the accessors method "getAuthor" from the support class and grabs the private data field author.
      System.out.println("\nAuthors:\n" + book1.getAuthor() + "\n" + book2.getAuthor() +
      "\n" + book3.getAuthor() + "\n" + book4.getAuthor() + "\n" + book5.getAuthor() + "\n");
      System.out.println("Your name is " + name);
   }
    
}

/** 
 * TestLibraryBook class with a main method that creates LibraryBook objects 
 * and calls its methods to test LibraryBook Class
 * @author Bartu Atabek 
 * @version 1.0 30/11/16 
 */ 
public class TestLibraryBook
{
   public static void main(String[] args)
   {
      // constants 
      
      // variables 
      LibraryBook book1;
      LibraryBook book2;
      
      // program code 
      book1 = new LibraryBook("The Universe", "Bartu Atabek", "15.11.16", 5);
      book2 = new LibraryBook("Programming for Dummies", "Bartu Atabek", "05.11.16", 8);
      
      System.out.println(book1 + "\n" + book2);
      // loaning the book with a new return date
      System.out.println("\n" +  "Return Date: " + book1.bookLoan());
      // check for whether the book is loaned or not
      System.out.println("Book is on loan: " + book1.onLoan());
      // returning the book
      System.out.println("Book Returned" + book1.bookReturn());
      // checking number of times book loaned
      System.out.println("Times book loaned: " + book1.getTimesLoaned());
      // check for whether the book is loaned or not
      System.out.println("Book is on loan: " + book1.onLoan());
      System.out.println(book1 + "\n" + book2);
   }
}
                              
                              
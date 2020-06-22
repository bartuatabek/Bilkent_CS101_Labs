import java.util.Scanner; 
 
/** 
 * The probgram prompts the user with aa menu which have various
 * selections and applies the selection  by using Library class.
 * @author Bartu Atabek 
 * @version 1.0 07/12/16 
 */  
public class LibraryTest 
{ 
   public static void main( String[] args) 
   { 
      Scanner scan = new Scanner( System.in); 
 
      // constants 
 
      // variables
      int selection;
      int nextSelection;
      String bookTitle;
      String title;
      String author;
      Library library;
      LibraryBook book;
 
      // program code 
      library = new Library();

      do
      {
      System.out.println( "Welcome to the Library");
      System.out.println( "1. Show");
      System.out.println( "2. Find");
      System.out.println( "3. Add");
      System.out.println( "4. Exit");
      
      selection = scan.nextInt();
      
      if ( selection == 1)
         System.out.println( library + "\n"); 
      else if ( selection == 2)
      {
         bookTitle = scan.nextLine();
         System.out.print( "Enter the title of the book");
         bookTitle = scan.nextLine();
         
         book = library.findByTitle(bookTitle);
         System.out.println(book);
         
         System.out.println( "1. Loan");
         System.out.println("2. Return");
         System.out.println("3. Remove");
         nextSelection = scan.nextInt();
         
         if ( nextSelection == 1)
         {
            book.bookLoan();
            System.out.println( "Book Loaned. \n");
         }
         if ( nextSelection == 2)
         {
            book.bookReturn(); 
            System.out.println( "Book returned. \n");
         }
         if ( nextSelection == 3)
         {
            library.remove(book);
         }
      }
      else if ( selection == 3)
      {
         // ask the user for the book title and author
         title = scan.nextLine();
         System.out.print( "Enter the book title: ");
         title = scan.nextLine();

         System.out.print( "Enter the author: ");
         author = scan.nextLine();
         
         library.add( title, author);  
         System.out.print( "Book added to the library. \n");
      }

   } while ( selection != 4);
   System.out.println( "Goodbye..."); 
   
   } 
   
}
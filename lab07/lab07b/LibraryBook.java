/**
 * LibraryBook class represents the methods for the book object so that 
   the books are assigned vith properties and also changes the loan and 
   return dates
 * @author Bartu Atabek 
 * @version 1.0 30/11/16 
 */
public class LibraryBook
{
   // properties
   private String title;
   private String author;
   private String dueDate;
   private int timesLoaned; 

   // constructors
   public LibraryBook(String TheTitle, String TheAuthor, String TheDueDate, int TheTimesLoaned)
   {
      title = TheTitle;
      author = TheAuthor;
      dueDate = TheDueDate;
      timesLoaned = TheTimesLoaned;
   }
   
   // methods
   public String toString()
   {
      return "Title: " + title + " Author: " + author +
                     " Due Date: " + dueDate + " Times Loaned: " + timesLoaned;
   }
   /**
    * adds and changes the loan properties of the books
    * @param newDueDate is the new due date assigned to book
    * @param timesLonaed is the number of times book loaned
    * @return result of the dice roll
    */   
   public String bookLoan()
   {
      int newDueDate;
      newDueDate = Integer.parseInt(dueDate.substring(0,2)) + 10;
      dueDate = Integer.toString(newDueDate) + ".11.16"; 
      timesLoaned++;
      return dueDate;
   }
   
   /**
    * returns to book and sets the return date to empty
    * @param dueDate is theknown due date of the loaned book
    * @return the new due date which is empty string
    */   
   public String bookReturn()
   {
      dueDate = "";
      return dueDate;
   }
   
   /**
    * Calculates the times that book loaned
    * @paramtimesLoaned is the number of times book loaned
    * @param die2 is the value of the die2
    * @return  is the number of times book loaned
    */   
   public int getTimesLoaned() 
   {
      return timesLoaned;
   }
   
   public boolean onLoan()
   {
      if (dueDate != "")
      {
         return true;
      }
      return false ;
   }
          
      

}
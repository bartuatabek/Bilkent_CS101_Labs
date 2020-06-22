import java.util.Scanner; 
 
/** 
 * simulates the rolling of pair of dice until two sixes, then reportss the roll number  
 * @author Bartu Atabek 
 * @version 1.0 30/11/16 
 */  
public class DiceRoller 
{ 
   public static void main( String[] args) 
   { 
      Scanner scan = new Scanner( System.in); 
 
      // constants 
 
      // variables
      int die1;
      int die2;
      int rollNumber;
 
      // program code 
      
      // set roll number to zero
      rollNumber = 0;
      // roll two die and continue rolling until two sixes thrown
      do 
      {
         die1 =  (int) (Math.random() * 6) + 1;
         die2 = (int) (Math.random() * 6) + 1;
         System.out.println(die1 + " " + die2);
         rollNumber++;
      } while (die1 != die2);
      
      // print out the roll number
      System.out.println("Roll number is: " + rollNumber);
      
   } 
 
}
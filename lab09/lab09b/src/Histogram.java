import java.util.Scanner;
import java.util.ArrayList;
 
/** 
 * The following program rolls a dice until the defined limit and then
 * adds the results into groups according to their numerical values and
 * finally with the obtained results it prints a histogram graph of
 * frequency distrubution.
 * @author Bartu Atabek 
 * @version 1.0 14/12/16 
 */  
public class Histogram 
{
   public static void main( String[] args) 
   { 
      Scanner scan = new Scanner( System.in); 
      // constants
      
      // variables
      int rollNumber;
      // program code
            
      // ask the user for the number of rolls
      System.out.println( "Enter a roll number.");
      rollNumber = scan.nextInt();
      
      System.out.println(diceFrequency(rollNumber));
      System.out.println(histogram(diceFrequency(rollNumber)));
   }
   
   /** 
    * Calculates the frequencies of the rolled die values 
    * @param roll is the number of rolls for the dice 
    * @return Arraylist of the  frequencies 
    */    
   public static ArrayList<Integer> diceFrequency(int roll)
   {
      // variables
      Dice dice;
      int diceRoll;
        
      // program code
      dice = new Dice();
      
      ArrayList<Integer>  frequency;
      frequency = new ArrayList<Integer> ();
      
      for (int i = 0; i < 11; i++)
         frequency.add(0);

      // roll the dice until the limit
      for (int i = 1; i <= roll; i++)
      {
         diceRoll = dice.rollDice();
         frequency.set(diceRoll - 2, frequency.get(diceRoll - 2) +1 );    
      }
      return frequency;
   }
   
   /** 
    * Prints out a histogram table
    * @param  Arraylist of the  frequencies 
    * @return histogram table of the frequencies
    */
   public static String histogram(ArrayList<Integer> frequency)
   {
      int maxFrequency;
      int starRepresent;
      maxFrequency = 0;
      
      for (int i = 0; i < frequency.size() -1; i++)
      {
         if (frequency.get(i) > maxFrequency)
            maxFrequency = frequency.get(i);
      }
      
      starRepresent = maxFrequency / 10;
      
      System.out.printf("%10s", "Frequency Distrubution");
      System.out.println();
      System.out.printf("%10s", "( max freq is " + maxFrequency + ")");
      System.out.println();
      
      for (int i = 10; i > 0; i--)
      {
         for (int index = 0; index <= frequency.size() - 1; index++)
         {
            if (frequency.get(index) / starRepresent >= i)
               System.out.print("* ");
            else
               System.out.print("  ");
         }
         System.out.print("\n");
      }
      return "";
   }
  
  
}
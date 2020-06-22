import java.util.Scanner; 
 
/** 
 * The program prints out the sum and number of values inputed by the user. 
 * @author Bartu Atabek 
 * @version 1.0 2/11/16 
 */  
public class Lab04b 
{ 
   public static void main( String[] args) 
   { 
      Scanner scan = new Scanner( System.in); 
 
      // constants 
      final int Number = 100; // Number of entries
      // variables
      int n;
      int count;
      int sum;
      int value;
      double average;
      int min;
      int max;
 
      // program code 
      /**
      // For 100 Values
      //System.out.print( "Please enter the number of your values:");
      //n = scan.nextInt();
      
      System.out.println( "Enter your values:");
      value = scan.nextInt();
      
      sum = 0;
      count = 1;
      min = value;
      max = value;
      
      
      while (count < Number)
      {  
         value = scan.nextInt();
         if (value > max)
            max = value;
      else if (value < min)
            min = value;
         sum = sum + value;
         count = count + 1;
         }
      
      average = sum / Number;
      
      System.out.println("Average is" + " " + average);
      System.out.println("Min is" + " " + min + " " + "Max is" + " " + max);
      */
      
      // For values up to a negative value
      System.out.println( "Enter your values: "); // x < 0 = sentinel
      value = scan.nextInt();

      sum = 0;
      count = 0;
      min = value;
      max = value;
      
      
      while (value > 0)
      {  
         if (value > max)
            max = value;
         else if (value < min)
            min = value;
         sum = sum + value;
         count = count + 1;
         value = scan.nextInt();
      }
      
      average = sum / count;
      
      System.out.println("Average is" + " " + average);
      System.out.println("Min is" + " " + min + " " + "Max is" + " " + max);
  
   } 
 
}
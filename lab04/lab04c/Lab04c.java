import java.util.Scanner;

/**
 * Program prints out a triange with the inputed character. 
 * @author Bartu Atabek
 * @version 1.0 2/11/16
 */ 
public class Lab04c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      char symbol;
      int width;
      int count;
      int row;

      // program code
      
      System.out.print( "Enter a character:");
      symbol = scan.next().charAt(0);
      
      System.out.print( " Enter a width:");
      width = scan.nextInt();
      
      count = 0;
      row = 0;
      
      // Print out the triangle shape with the inputs.
      while (row < width)
      {  
         row = row + 1;
         while (count < row)
         {
            count = count + 1;
            System.out.print(symbol);
            }
         count = 0;
         System.out.println();
         }
      /**
      double d;
      d = 0.1;
      while ( d != 1.0 )
      {
         System.out.println( d);
         d = d + 0.1;
         }
     System.out.println( d + " <- final value after loop!");
     */ 
   }

}
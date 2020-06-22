import java.util.Scanner; 

/** 
 * Program tests the BigNum class by creating 3 distinct
 * objects and constructing them differently and also
 * tests the methods inside the BigNum class.
 * @author Bartu Atabek 
 * @version 1.0 21/12/16 
 */  
public class Test
{ 
   public static void main( String[] args) 
   { 
      Scanner scan = new Scanner( System.in); 
      
      final int BASE = 2;
      final int SIZE = 8;
      
      
      int[] num; 
      num = new int[8];
      
      String number = "110";
      int result;
      String output;
      
      output = number; 
      number = "";
      
      System.out.println( output);
      
      for (int i = output.length() - 1; i >= 0; i--) 
      {
         number = number + output.charAt(i);
      }
      
      System.out.print( number);
      
      for ( int i = 0; i < number.length(); i++)
      {
         num[i] = Integer.parseInt( number.substring(i, i + 1) );
      }
      
      for ( int i = number.length() + 1; i < num.length; i++)
      {
         num[i] = 0;
      }
      
      //test print array
      System.out.println();
      for (  int i = 0; i < num.length; i++)
         System.out.print(num[i] + ", ");
      System.out.println();
   }
}
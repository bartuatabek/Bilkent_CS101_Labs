import java.util.Scanner; 
 
/** 
 * Program tests the BigNum class by creating 3 distinct
 * objects and constructing them differently and also
 * tests the methods inside the BigNum class.
 * @author Bartu Atabek 
 * @version 1.0 21/12/16 
 */  
public class Lab10a 
{ 
   public static void main( String[] args) 
   { 
      Scanner scan = new Scanner( System.in); 
 
      // constants 
 
      // variables 
      BigNum b1;
      BigNum b2;
      BigNum b3;
      BigNum b4;
 
      // program code 
      b1 = new BigNum();
      b2 = new BigNum("110");
      b3 = new BigNum(b2);
      b4 = new BigNum("1010");
      
      // testing the BigNum class
      System.out.println( "b1 is " + b1);
      System.out.println( "b2 is " + b2); 
      System.out.println( "b3 is " + b3); 
      
      // testing methods
      System.out.println();
      // shift right
      b2.shift(false);
      System.out.println("Right Shifted number: " + b2);
      System.out.println();
      // shift left
      b2.shift(true);
      System.out.println("Left Shifted number: " + b2);
      System.out.println();
      // add method
      b2.add(b4);
      System.out.println( "b2 is " + b2 + "\n" + "Overflow is " + b2.add(b4));
 
   } 
 
}
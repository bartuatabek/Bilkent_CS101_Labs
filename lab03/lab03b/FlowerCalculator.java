import java.util.Scanner;

/**
 * Flower Counter calculates the maximum number of flowers in a triangular area.
 * @author Bartu Atabek
 * @version 1.1 26.10.16
 */ 
public class FlowerCalculator
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      final  int FLOWERS_PER_SQUARE = 17;
        
      // variables
      double side1;
      double side2;
      double side3;
      double area;
      double semiPerimeter;
      double x;
      int numberOfFlowers;
      // program code
      System.out.println( "Welcome to  Triangular Flower Calculator");
      System.out.println( "To calculate the maximum number of flowers please enter the following measurements");
     
      System.out.println( "Please enter the lenght of your sides ");
      System.out.print( "A = ");
      side1 = scan.nextDouble();
     
      System.out.print( "B = ");
      side2 = scan.nextDouble();
      
      System.out.print( "C = ");
      side3 = scan.nextDouble();
                         
      if (side1<=0||side2<=0||side3<=0)
        System.out.println("Length of sides cannot be equal to or less than zero");
      else {if (side3 < side1+side2 || side3 > Math.abs(side1-side2))
        System.out.println("Invalid value");
      else if (side2 < side1+side3 || side2 > Math.abs(side1-side3)) 
        System.out.println("Invalid value");
      else if (side1 < side2+side3 || side1 > Math.abs(side2-side3))            
        System.out.println("Invalid value");
      }        
               
      semiPerimeter = (side1 + side2 + side3) / 2;                 
      x = ((semiPerimeter) * (semiPerimeter-side1) * (semiPerimeter-side2) * (semiPerimeter-side3));
      area = Math.sqrt(x);              
        
      System.out.print( "The area of the triangle having side lenghts" );
      System.out.print((int)side1);
      System.out.print(","); 
      System.out.print((int) side2);
      System.out.print(","); 
      System.out.print( (int) side3);  
      System.out.print(" is ");
      System.out.printf("%2f", area);
      System.out.println("."); 
    
      System.out.print("The number of flowers required for this area is:  ");
      numberOfFlowers =  (int) area * FLOWERS_PER_SQUARE;
      System.out.print(numberOfFlowers);
      System.out.println(".");
   }

}
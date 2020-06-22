import java.util.Scanner;

/**
 * __Flower Counter calculates the maximum number of flowers in a triangular area.___ 
 * @author __Bartu Atabek___
 * @version __1.0 2016/10/19__
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
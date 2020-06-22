import java.util.Scanner;

/**
 * __Simple Calculator that computes basic operations___ 
 * @author __Bartu Atabek___
 * @version __1.0 2016/10/19__
 */ 
public class SimpleCalculator
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
        final double PI = 3.142;
        
      // variables
        int firstNumber;
        int secondNumber;
        int sum;
        int subtract;
        int prod;  
        double division;
        double remainder;
        int max;
      // program code
        
       System.out.println("Welcome to Basic Calculator ");
       
       System.out.println("please enter the first number");
       firstNumber = scan.nextInt();
       
       System.out.println("please enter the second number");
       secondNumber = scan.nextInt();
       
       System.out.println("The sum of the given numbers is ");
       sum = firstNumber + secondNumber;
       System.out.println(sum);
       
       System.out.println("The subtraction of the given numbers is ");
       subtract = firstNumber - secondNumber;
       System.out.println(subtract);
       
       System.out.println("The product of the given numbers is ");
       prod = firstNumber * secondNumber;
       System.out.println(prod);
       
       System.out.println("The division of the given numbers is ");
       division = firstNumber / secondNumber;
       System.out.println(division);
       
       System.out.println("The remainder of this division is ");
       remainder = firstNumber % secondNumber;
       System.out.println(remainder);
       
       System.out.println(" Maximum value is ");
        max = + Math.max(firstNumber, secondNumber);
       System.out.println(max);
   }

}
      



      

    
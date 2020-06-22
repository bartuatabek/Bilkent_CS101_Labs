import java.util.Scanner; 
 
/** 
 * program creates and tests lots of BigNum objects
 * by using the BigNum class and it's methods in order to
 * determine the biggest number.
 * @author Bartu Atabek 
 * @version 1.0 21/12/16 
 */  
public class Lab10b
{ 
   public static void main( String[] args) 
   { 
      Scanner scan = new Scanner( System.in); 
 
      // constants 
 
      // variables 
      BigNum[] numbers;
      BigNum biggest;
      BigNum swap;
      String str;
      str = "";
      int n;
      
 
      // program code 
      numbers = new BigNum[10];
      
      for ( int t = 0; t < 10; t++)
      {
         // creating a number BigNum
         str = "";
         BigNum number;
         for ( int i = 0; i < BigNum.SIZE; i++)
            str +=  (int) (Math.random() * (BigNum.BASE));
         number = new BigNum(str);
         numbers[t] = number;
         System.out.println(number + "\n");
      }
      
      
      // do-while-loop until user enters n < 0
      do
      {
         // asking user for the value of n 
         System.out.print( "Enter value for n: ");
         n = scan.nextInt();
         
         if ( n > 10 == true)
         {
            System.out.println( "Invalid input!");
            n = scan.nextInt();
         }
         
         biggest = new BigNum();
         // finding the biggest BigNum
         for ( int i = 1; i < n; i++)
         {
            if (numbers[i - 1].isLessThan(numbers[i]))
               biggest = numbers[i];
            else
               biggest = numbers[i - 1];
         }
         System.out.println("Biggest number: " + biggest);
         System.out.println();
         
         // swap biggest with n_th number
         swap = new BigNum(biggest);
         if ( n == 10)
         {
            biggest = numbers[n - 1];
            numbers[n - 1] = swap;
         }
         else
         {
            biggest = numbers[n];
            numbers[n] = swap;
         }
         // print out all numbers
         for ( int i = 0; i < BigNum.SIZE; i++)
            System.out.println(numbers[i] + "\n");
           
      } while ( n > 0);
      
      System.out.println("Goodbye.");
                
   }
}
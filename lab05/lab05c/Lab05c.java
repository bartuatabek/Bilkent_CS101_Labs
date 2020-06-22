import java.util.Scanner; 
 
/** 
 * simple calculator program with a user menu for basic operations  
 * @author Bartu Atabek 
 * @version 1.0 16/11/16 
 */  
public class Lab05c 
{ 
   public static void main( String[] args) 
   { 
      Scanner scan = new Scanner( System.in); 
 
      // constants
      // alternative for operation determiner
//      final char SUM = '+';
//      final char SUBTRACT = '-'; 
//      final char MULTIPLY = '*';
//      final char DIVISION = '/';
//      final char CLEAR = 'C';
//      final char CLEAR2 = 'c';
//      final char QUIT = 'Q';
//      final char QUIT2 = 'q';
//      final char SIN = 's';        
       
      // variables
      double result;
      double number;
      double term;
      double sum;
      String operation;
      String opt_identify;
      String input;
      boolean done;
      
      // program code
      
      // print welcome message
      System.out.println( "Welcome to \"SimpleCalc\"...");
      System.out.println();
      System.out.println("------------------");
      
      result = 0; // set result to 0
      done = true;
      //display menu and operate according to functions chosen by user
      do
      {
         // menu interface
         System.out.println("[" + result + "]");
         System.out.println("------------------");
         
         System.out.println("+,-,*,/,sin value");
         System.out.println("Clear");
         System.out.println("Quit");
         
         System.out.println("------------------");
         System.out.print("Select:");
         opt_identify = scan.next();
         // operations
         System.out.println("------------------");
         
         if ( opt_identify.charAt(0) == '+')
         {
            number = scan.nextDouble();
            result = result + number;
            System.out.println("------------------");
         }
         if ( opt_identify.charAt(0) == '-')
         {
            number = scan.nextDouble();
            result = result - number;
            System.out.println("------------------");
         }
         if (opt_identify.charAt(0) == '*' )
         {
            number = scan.nextDouble();
            result = result * number;
            System.out.println("------------------");
         }
         if ( opt_identify.charAt(0) == '/')
         {
            number = scan.nextDouble();
            if (number != 0)
               result = result / number;
            else
               System.out.println("Error!");
            
            System.out.println("------------------");
         }
         if ( opt_identify.charAt(0) == 's')
         {
            number = scan.nextDouble();
            // alternative #1
            number = Math.toRadians(number);
            result = Math.sin(number);
            
//            // alternative #2
//            // convert x to an angle between -2 PI and 2 PI
//            number = number % (2 * Math.PI);
//            // compute the Taylor series approximation
//            term = 1.0;      // ith term = number^i / i!
//            sum  = 0.0;      // sum of first i terms in taylor series
//           
//            for (int i = 1; term != 0.0; i++) 
//            {
//               term = term * (number / i);
//               if (i % 4 == 1)
//                  sum = sum + term;
//               if (i % 4 == 3) 
//                  sum = sum - term;
//            }
//            result = sum;
//            
//            // alternative #3
//            // convert x to an angle between -2 PI and 2 PI
//            number = number % (2 * Math.PI);
//            // compute the Taylor series approximation
//            term = 1.0;      // ith term = number^i / i!
//            sum  = 0.0;      // sum of first i terms in taylor series
//           
//            for (int i = 1; term < 0.0001; i++) 
//            {
//               term = term * (number / i);
//               if (i % 4 == 1) 
//                  sum = sum + term;
//               if (i % 4 == 3) 
//                  sum = sum - term;
//            }
//            result = sum;
         }   
         if ( opt_identify.charAt(0) == 'c' || opt_identify.charAt(0) == 'C')
         {
            result = 0;
         }
//         if ( opt_identify.charAt(0) == 'q' || opt_identify.charAt(0) == 'Q')
//         {
//            done = false;
//         }
         
//      } while (done);
        } while (opt_identify.charAt(0) != 'q' && opt_identify.charAt(0) == 'Q');
               
      System.out.println("Thanks for using \"SimpleCalc\", goodbye.");       
                  
   } 
   
}
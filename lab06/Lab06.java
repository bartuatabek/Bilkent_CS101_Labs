import java.util.Scanner; 
 
/** 
 * program operates combination of various methods and prints results 
 * @author Bartu Atabek 
 * @version 1.1 23/11/16 
 */  
public class Lab06 
{ 
   /**
    * Computes and returns x to the power y
    * @param x is any real value and the base
    * @param y is a positive integer and the power 
    * @return result of x to the power y
    */
   public static double power(double x, int y)
   {
      double result = 1;
      
      if (y < 0)
      {
         result = 1 / (result * x);
      }
      else
      {
         for (int i = 1; i <= y; i++)
            result *= x;
      }
      return result; 
   }
   
    /**
    * Computes n factorial 
    * @param n is any positive integer
    * @return n factorial
    */
   public static double factorial(int n)
   {
      double fact;
      fact = 1;
      
      for (int i = 2; i <= n; i++)
      {
        fact = fact * i; 
      }
      return fact;
   }
   
   /**
    * Takes a String parameter and returns the reverse
    * @param s is a String parameter
    * @return the reverse String
    */
//   public static String reverse(String s)
//   {
//      String reverse = "";
//      
//      for (int i = s.length() - 1; i >= 0; i--)
//      {
//         reverse = reverse + s.charAt(i);
//      }
//      return reverse;
//   }
   
   public static String reverse(String s)
   {
      String[] words = s.split(" ");
      
      String reverseString = "";
      
      for (int i = 0; i < words.length; i++) 
      {
         String word = words[i];
         
         String reverseWord = "";
         
         for (int j = word.length()-1; j >= 0; j--) 
         {
            reverseWord = reverseWord + word.charAt(j);
         }
         
         reverseString = reverseString + reverseWord + " ";
      }   
      return reverseString;
   }
     
   
   /**
    * Converts the given base2 String to its base10 equivalent
    * @param base2 is a number in base2 (String)
    * @return the base10 equivalent
    */
   public static int toDecimal( String base2)
   {
//      int base10;
//      base10 = Integer.parseInt(base2, 2); 
//      return base10;
      
      int baseLength;    
      int sum;
      int count;
      int power;
      char c;
      
      baseLength = base2.length();
      sum = 0;
      count = 0;
      power = 1;
      c = base2.charAt(count);
      
      if (c != '1' && c!= '0')
         System.out.println("Error!");
      else
      {
         for (count = baseLength -1; count >= 0 ; count--)
         {
            c = base2.charAt(count);
            if (c == '1')
               sum = sum + power;
            power = power * 2;
         }
        
      }
      return sum;
   }
     
   /**
    * Converts a positive decimal int value into the binary String.
    * @param base10 is a number in base10 (int)
    * @return the base2 binary equivalent String
    */
   public static String toBinary(int base10)
   {
//      String base2;
//      base2 = Integer.toBinaryString(base10); 
//      return base2;
      
      int rem;
      int num =base10; 
      String str="";
      while(num>0)
        {
            rem = num%2;
            str = rem + str;
            num=num/2;
        }
      return str;
   }
   
   /**
    * Calculates the value sin(x)
    * @param x is any number 
    * @return the sin of x by using the taylor series
    */
   public static double sin(double x)
   {   
      double term;
      double sum;
      //convert x to an angle between -2 PI and 2 PI
      x = x % (2 * Math.PI);
      // compute the Taylor series approximation
      term = 1.0;      // ith term = number^i / i!
      sum  = 0.0;      // sum of first i terms in taylor series
      
      for (int i = 1; term != 0.0; i++) 
      {
         term = term * (x / i);
         if (i % 4 == 1)
            sum = sum + term;
         if (i % 4 == 3) 
            sum = sum - term;
      }
      return sum;
   }
   
   public static void main( String[] args) 
   { 
      Scanner scan = new Scanner( System.in); 
 
      // constants 
      final int SPACE = 8;
 
      // variables 
      int y;
      int length;
      int a;
      String binary1;
      String binary2;
      int decimal1;
      int decimal2;
      String text;
      double x;
      double term;
      double sum;
 
      // program code 
        
//      System.out.println(power(x,y));
//      System.out.println(factorial(4));
//      System.out.println(reverse("abcd"));
//      System.out.println(toDecimal("1011"));
//      System.out.println(toBinary(11));
      
      // 1-printing a power table for n values from [-1,10]
      
      System.out.println(" n  |  n-squared  |  n-cubed  |  n to the power 4");
      
      for (int n = -1; n < 11; n++)
      { 
         y = 1;
         while (y <= 4)
         {
            if (n != -1)
            {
               System.out.print(" ");
            }
            System.out.print(power(n,y));
            // spacing and alignment
            if (power(n,y) == -1)
            {
               System.out.print(" ");   
            }
            length = (int) Math.log10(power(n,y)) + 1;

            for (a = 0; a < (SPACE - length); a++)
            {
               System.out.print(" ");
            }
            y++;
         }
         n++;
         System.out.println();
      }
     
      System.out.println();
      
     // 2-printing a table of n and n-factorial, for values of n from 1 to 15
      
      System.out.println(" n | n-factorial");
      
      for (int n = 1; n <= 15; n++)
      {
         System.out.print(" " + n);
         // spacing and alignment
         length = (int) Math.log10(n) + 1;

            for (a = 0; a < (SPACE - length); a++)
            {
               System.out.print(" ");
            }
         System.out.print(factorial(n));
         System.out.println();
      }
      
      System.out.println();
      
      // 3-
      // read two base-2 Strings from the user
      System.out.print("Enter two binary strings:");
      binary1 = scan.nextLine();
      binary2 = scan.nextLine();
      // convert them to decimal
      decimal1 = toDecimal(binary1);
      decimal2 = toDecimal(binary2);
      // add them together and print the result in binary form
      System.out.print(toBinary(decimal1 + decimal2));
      
      System.out.println();
      
      // 4-read a line from user and print it again backwards
      System.out.println();
      System.out.print("Enter a line of text:");
      text = scan.nextLine();
      
      System.out.print(reverse(text));
      
      System.out.println();
      
      // 5-table of raw calculations for Taylor Series expansion of sin(x)
      System.out.println();
      System.out.print("Enter a value for \"x\"");  
      x = scan.nextDouble();
      
      System.out.println(" n | (-1)^n | x^(2n+1) | (2n+1)! | the term | sum of the preceeding terms");
      sum = 0;
      
      for (int n = 0; n <= 10; n++)
      {
         term = (power(-1,n) / factorial((2 * n) + 1)) *  power(x,(2 * n) + 1);
         sum += term; 
         System.out.print(" " + n + "  " + power(-1,n) + "  " + power(x,(2 * n) + 1) + "  " + factorial((2 * n) + 1) + "  " + term + "  " + sum);
         System.out.println();
      }
      // sin(x) alternative method and comparison with Math.sin(x)
      System.out.println(); 
      System.out.println("The value of sin(" + x + ") is");
      System.out.println(sin(x));
      System.out.println(Math.sin(x));
       
   } 
 
}
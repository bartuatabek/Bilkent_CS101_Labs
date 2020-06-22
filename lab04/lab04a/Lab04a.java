import java.util.Scanner; 

/** 
 * Program prints out values from [-n,n] where n is a positive integer added by the user  
 * @author Bartu Atabek 
 * @version 1.0 2/11/16 
 */  
public class Lab04a 
{ 
   public static void main( String[] args) 
   { 
      Scanner scan = new Scanner( System.in); 
      
      // constants 
      
      // variables 
      int n;
      int negative_n;
      int square;
      int j; // j is output counter 
      double k; 
      int i; // i is divisor
      
      // program code 
      
      // Ask the user to enter a value.
      System.out.print( "Please enter a value:"); 
      n = scan.nextInt();
      int temp= n;
      int temp_2 = n;
      
      // Print error message if value is invalid.
      while (n <=  0)
      {  
         System.out.print("Invalid value. Please try again.");
         n = scan.nextInt();
      }
      
       // A-1
      System.out.println("Part A-1);
                            
       negative_n = -n;
       // Print even numbers from [-n,n] in one line  
       while (negative_n <= n)
       {  
          if (negative_n % 2 == 0)
             System.out.print(negative_n + " ");
          negative_n++;
       }
       
       // A-2
       System.out.println("Part A-2);
       System.out.println("\n");
       square = 0;
       
       
       // Print the squares of even numbers from [0,n] and 5 values per line. 
       
       j = 0; 
       while (square * square <= n * n)
       {  
          if ((square % 2) == 0)
          {  
             System.out.print(square * square + " ");
             j++;
             if ((j % 5) == 0)
             {  
                System.out.println("\n");
                j = 0;
             }
          }
          square = square + 1;
          
       }
       
       System.out.println("\n");
       
       
       // A-3
      System.out.println("Part A-3);
      // Print the numbers divisible by 3 or 4 but not both between [n,3]
      j = 0;
      
      if (n < 3)
      {  System.out.println("Invalid value. Please try again");
         n = scan.nextInt();
      }
      else
      {
         while ( n >= 3) 
         {  
            if ((n % 3 == 0 || n % 4 == 0) && (n % 12 != 0 ))
            {   
               System.out.print(n + " ");
               j++;
            }
            if ((j % 5) == 0)
            {  
               System.out.print("\n"); 
            }
            n = n -1;
         }
       
      }

    // A-4
    System.out.println("Part A-4);
    System.out.println("\n"); 
    // Print 1/n values with 2 decimals for the interval [0.01,n]

    k = (double) 1 / temp;
    j = 0;
    while (k > 0.01 && temp > 0)
    {  
       System.out.printf("%.2f", k);
       System.out.print( " ");
       j++;
       if ((j % 5) == 0)
       {  
          System.out.println("\n");
          j = 0;
       }
    temp = temp - 1;
    k = (double) 1 / temp;  
    }
    
   
    System.out.println("\n");
    
    // A-5
     System.out.println("Part A-5);
    // Print the divisors of n for 5 values each line 
    i = 2;
    
    while (i <= temp_2)
    {  
       if (temp_2 % i == 0)
          System.out.print(i + " ");
       i = i + 1;
    }
      
 
 }
}

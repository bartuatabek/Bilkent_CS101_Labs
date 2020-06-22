import java.util.Scanner; 
 
/** 
 * if statements and loops test for practise  
 * @author Bartu Atabek 
 * @version 1.0 26.10.16 
 */  
public class Lab03a 
{ 
   public static void main( String[] args) 
   { 
      Scanner scan = new Scanner( System.in); 
 
      // constants 
 
      // variables 
      int even = 0;
      int odd = 0;   
      int n;
      int sum = 0;
      int sum2;
      
      // program code  
      System.out.println("Please enter a value for n.");
      System.out.print( "n:");
      n = scan.nextInt();
      
      for ( int x = 0; x <= 50; x++ ) 
{     
      
      if  ( 12 <= x & x <= 25 )   
          System.out.println(x);
      else
         System.out.println( x + " out of range 12-25" );
      
      if (x % 2 == 0) 
         even = even+1;
      else
         odd = odd+1;
      
      
      if (x % 5 == 0)
         System.out.println("Hi Five");
      else if ( x % 2 == 0)
         System.out.println("Hi Two");
      else if ( x % 3 == 0 || x % 7 == 0)
         System.out.println("Hi ThreeOrSeven");
      else
         System.out.println("Hi Others!");
      
      
      if ( x <= n)
         sum = sum + x;
     // System.out.println(" The sum of the numbers is:" + sum);
      
      sum2 = n*(n+1)/2;
      
      if ( sum == sum2)
         System.out.println( "They are the same");
      else
         System.out.println( "They are not the same");        
         
}         

      System.out.println( " The number of even values is:" + even) ;
      System.out.println( " The number of odd values is:" + odd) ;            
                            
   } 
 
}
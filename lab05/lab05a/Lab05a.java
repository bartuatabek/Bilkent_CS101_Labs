import java.util.Scanner; 
 
/** 
 * Program prints a rectangular pattern with a user specified width, height and wall thickness.  
 * @author Bartu Atabek 
 * @version 1.0 16/11/16 
 */  
public class Lab05a
{ 
   public static void main( String[] args) 
   { 
      Scanner scan = new Scanner( System.in); 
 
      // constants 
      final String YES = "y";
      final String YES2 = "Y";

      // variables 
      int width;
      int height;
      int thickness;
      int h_space; // horizontal space
      int v_space; // vertical space
      String repeat;
      
      // program code 
      repeat = "";
      
      do
      {
         // ask the user for width, height & thickness.
         System.out.println( "Enter width, height & thickness:"); 
         width = scan.nextInt();
         height = scan.nextInt();
         thickness = scan.nextInt();
         
         // print error if values not positive.
         if (width <= 0 || height <= 0 || thickness <= 0)
            System.out.print("Error: all values must be positive!");
         
         // print the base of the rectangle.
         for (int i = 0; i < thickness; i++) 
         {
            for (int j = 0; j < width; j++) 
            {
               System.out.print("*");
            }
            System.out.println();
         }
         
         // decision for the hole.
         if (height > 2 * thickness) 
         {
            h_space = width - (thickness * 2); // horizontal space required
            v_space = height - (thickness * 2); // vertical space required
            for (int a = 0; a < v_space; a++)
            {
               for (int c = 0; c < thickness; c++)
               {
                  System.out.print("*");
               }
               for (int k = 0; k < h_space; k++)
               {
                  System.out.print(" ");
               }
               for (int c = 0; c < thickness; c++)
               {
                  System.out.print("*");
               }
               System.out.print("\n");
            }
         
            // print the base of the rectangle.
            for (int i = 0; i < thickness; i++) 
            {
               for (int j = 0; j < width; j++) 
               {
                  System.out.print("*");
               }
               System.out.println();
            }
         }
         else
         {
            for (int i = 0; i < thickness - 1; i++)
            {
               for (int j = 0; j < width; j++) 
               {
                  System.out.print("*");
               }
               System.out.println();
            }
            System.out.println("Oops... no hole!");
         }
            
         // ask the user for another pattern
         repeat = scan.nextLine();
         System.out.println("Do you wish to create another pattern?");
         repeat = scan.nextLine();
      } while (repeat.equals(YES) || repeat.equals(YES2));

      System.out.println("goodbye");
      
         
   } 
 
}
import java.util.Scanner; 
 
/** 
 * program prints bunch of tables with various features  
 * @author Bartu Atabek 
 * @version 1.0 16/11/16 
 */  
public class Lab05b 
{ 
   public static void main( String[] args) 
   { 
      Scanner scan = new Scanner( System.in); 
 
      // constants 
      final int SPACE = 6;
 
      // variables
      int row;
      int column;
      int x; // row value
      int y; // column value
      int length;
      int a;
      int i;
 
      // program code
      
      // ask the user for the number of rows and columns
      System.out.println("Enter the number of rows and columns.");
      row = scan.nextInt();
      column = scan.nextInt();
      
      // row and column values starts from 1
      x = 1;
      y = 1;
      
       // print table 1 (row,col) table
      System.out.println("Cartesian Table");
      for (i = 0; i < (row * column); i++)
      {
         for (a = 0; a < row; a++) // space indicating algorithm
         {
            System.out.print(" ");
         }
         System.out.print(x + "," + y);
         y++;
         if ( y % column == 0)
         {
            for (a = 0; a < row; a++)
            {
               System.out.print(" ");
            }
            System.out.print(x + "," + y);
            System.out.println();
            y = 1;
            x++;
            i++;
         }
      }
      System.out.println();
      
      // table 2 (product table)
      System.out.println("Multiplication Table");
      
      x = 1;
      y = 1;
            
      for (i = 0; i < (x * y); i++)
      {
         length = (int) (Math.log10(x * y)+1);
         for (a = 0; a < (SPACE - length); a++)
         {
            System.out.print(" ");
         }
         System.out.print(x * y);
         y++;
         
         if ( y == column)
         {
            for (a = 0; a < (SPACE - length); a++)
            {
               System.out.print(" ");
            }
            System.out.print(x * y);
            System.out.println();
            x++;
            y = 1;
            i++;
         }
      }
      System.out.println();
      
      // table 3 (cell number table)
      System.out.println("Cell Number Table");
      
      y = 1;
      
      for (i = 0; i < (row * column); i++)
      {
         length = (int) (Math.log10(i)+1);
         if ( i == 0)
         {
            length = 1;
         }
         
         for (a = 0; a < (SPACE - length); a++)
         {
            System.out.print(" ");
         }
         System.out.print(i);
         y++;
         
         if ( y % column == 0)
         {
            for (a = 0; a < (SPACE - length); a++)
            {
               System.out.print(" ");
            }
            System.out.print(i +1);
            System.out.println();
            y = 1;
            i++;
         }
      }
      
      System.out.println();
      
      // table 4 (row number table)
      System.out.println("Row Number Table");
      
      x = 1;
      y = 1;
      
      for (i = 0; i < (row * column); i++)
      {
         if ( y == 1)
         {
            for (a = 0; a < row; a++)
            {
               System.out.print(" ");
            }
            System.out.print(x);
            x++;
            y++;
         }
         else if ( y != 1 && y != column)
         {
            while ( y < column)
            {
               for (a = 0; a < row; a++)
               {
                  System.out.print(" ");
               }
               System.out.print("-");
               y++;
            }
         }
         else if ( y == column)
         {
            for (a = 0; a < row; a++)
            {
               System.out.print(" ");
            }
            System.out.print("-");
            System.out.println();
            y = 1;
            i++;
         }
      }
         
   } 
 
}
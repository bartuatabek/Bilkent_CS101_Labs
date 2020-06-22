import java.util.Scanner;
import java.nio.file.*;   
import java.io.*;

/**
 * Webpage creator enables you to create and edit webpages
 * @author Bartu Atabek
 * @version 1.1 26.10.16
 */ 
public class Lab03c
{
   public static void main( String[] args) throws 
   FileNotFoundException
   {
      Scanner scan = new Scanner( System.in);
      PrintStream originalStdOut = System.out;
      
 // constants
      final double TAX_1 = 0.05;
      final double TAX_2 = 0.25;
      final double TAX_3 = 0.15;
      final String HTML = "<html>";
      final String HEAD = "<head>";
      final String TITLE = "<title>";
      final String TITLE2 =  "</title>";
      final String HEAD2 = "</head>";
      final String BODY = "<body>";
      final String HR = "<hr>";
      final String HL = "<hl>";
      final String HL2 = "</hl>";
      final String P = "<p>";
      final String P2 = "</p>";
      final String BR = "<br clear='all'>";
      final String BODY2 = "</body>";
      final String HTML2 = "</html>";  
      final String GIF1 = "<img src=\"";
      final String GIF2 = "\"align=\"left\">";

      // variables
      String title;
      String name;
      int age;
      double salary;
      String comments;
      double netSalary;
      double tax;
      
      // program code
      System.out.println( "Enter title for the webpage ");
      title = scan.nextLine();
       
      System.out.println( "Enter your name: ");
      name = scan.nextLine();
      
      System.out.println( "Enter your age: ");
      age = scan.nextInt();
      if (age <= 0)
      {  System.out.println(" Entered age is not valid");
         age = scan.nextInt();
         }
      System.out.println( "Enter your salary: ");
      salary = scan.nextDouble();
      scan.nextLine(); // trick
      if ( salary <=0)
      {  System.out.println(" Entered salary is not valid");
         salary = scan.nextDouble();
         }
      else if ( salary > 10000)
      {  System.out.println(" Entered salary is not valid");
         salary = scan.nextDouble();
         }
      System.out.println( "Enter  comments: ");
      comments = scan.nextLine();
      
     
     
      
      // Calculate the net salary
      netSalary = (salary - 100) - (salary - 100)*15/100;
      // Define initial tax as 0     
      tax = 0;
      
      // Look for invalid inputs and pint error message
     /** if (age <= 0)
      {  System.out.println(" Entered age is not valid");
         age = scan.nextInt();
         }
      else if ( salary <=0)
      {  System.out.println(" Entered salary is not valid");
         salary = scan.nextDouble();
         }
      else if ( salary > 10000)
      {  System.out.println(" Entered salary is not valid");
         salary = scan.nextDouble();
         }
      */
      if (salary < 1000)
      {  netSalary = (salary - 100) - (salary - 100)*TAX_1;
         tax = TAX_1;
         }
      else if (salary > 5000)
       {  netSalary = (salary - 100) - (salary - 100)*TAX_2;
          tax = TAX_2;
          }
      else if (salary >= 1000)
       {  netSalary = (salary - 100) - (salary - 100)*TAX_3;
          tax = TAX_3;
          }
       else if ( salary <=5000)
       {  netSalary = (salary - 100) - (salary - 100)*TAX_3;
          tax = TAX_3;
          }
       
          
      System.setOut( new PrintStream( "magic.htm" ) );
      
      // Print html code   
      System.out.println(HTML);
      System.out.println(HEAD);
      System.out.println(TITLE);
      System.out.print(title);
  
      System.out.println(TITLE2);
      System.out.println(HEAD2);
      
      System.out.println(HR);
      
      if (Files.exists( Paths.get( name + ".gif") ))
         System.out.println(GIF1 + name + ".gif" + GIF2);
      
      System.out.println(HL);
      System.out.print(name);
      System.out.print(HL2);
      
      System.out.println(P);
      System.out.print("Age: ");
      System.out.print(age);
      System.out.println(P2);
      
      System.out.println(P);
      System.out.print(" Salary: ");
      System.out.print(netSalary);
   // System.out.print("$(%15 tax)");
      System.out.print("(" + tax);
      System.out.print("tax)");
      System.out.print(P2);
      
      System.out.println(P);
      System.out.print(" Comments: ");
      System.out.print(comments);
      System.out.println(P2);
      
      System.out.println(BR);
      System.out.println(HR);
        
      System.out.println(BODY2);
      System.out.println(HTML2);
      
      System.out.close();
System.setOut( originalStdOut);
System.out.println( "Webpage created.");
   }

}


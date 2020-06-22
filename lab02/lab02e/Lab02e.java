import java.util.Scanner;

/**
 * __Webpage creator enables you to create and edit webpages___ 
 * @author __Bartu Atabek___
 * @version __1.0 2016/10/19__
 */ 
public class Lab02e
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
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


      // variables
      String title;
      String name;
      int age;
      double salary;
      String comments;
     
      // program code
      //System.out.println( "Enter title for the webpage ");
      title = scan.nextLine();
       
      //System.out.println( "Enter your name: ");
      name = scan.nextLine();
      
      //System.out.println( "Enter your age: ");
      age = scan.nextInt();
      
      //System.out.println( "Enter your salary: ");
      salary = scan.nextDouble();
      scan.nextLine(); // trick

      //System.out.println( "Enter  comments: ");
      comments = scan.nextLine();
      
      System.out.println(HTML);
      System.out.println(HEAD);
      System.out.println(TITLE);
      System.out.print(title);
  
      System.out.println(TITLE2);
      System.out.println(HEAD2);
      
      System.out.println(HR);
      System.out.println(HL);
      System.out.print(name);
      System.out.print(HL2);
      
      System.out.println(P);
      System.out.print("Age: ");
      System.out.print(age);
      System.out.println(P2);
      
      System.out.println(P);
      System.out.print(" Salary: ");
      System.out.print(salary);
      System.out.print(P2);
      
      System.out.println(P);
      System.out.print(" Comments: ");
      System.out.print(comments);
      System.out.println(P2);
      
      System.out.println(BR);
      System.out.println(HR);
        
      System.out.println(BODY2);
      System.out.println(HTML2);
      
   }

}


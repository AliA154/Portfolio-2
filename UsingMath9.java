import java.util.Scanner;
import java.text.DecimalFormat; 

public class UsingMath9 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in); 
    
    
    /*
    DecimalFormat df = new DecimalFormat(".000"); 
    
    double num1, num2, num3, total;
    
    System.out.print("Please enter the first number: ");
    num1 = input.nextDouble();
    System.out.print("Please enter the second number: ");
    num2 = input.nextDouble();
    System.out.print("Please enter the third number: ");
    num3 = input.nextDouble(); 
    
    
    total = num1 + num2 + num3;
    System.out.println("The Total of all the numbers is "+total);
    total/=7;
    System.out.println("The Total after dividing by 7 is "+df.format(total));
    */
    double a = 1.2, b = .123456789, c = 1234.56789, d = 123456789;
    /*Rules for DecimalFormat 
     1) 0 -> rounds off to a point, forces a 0 if empty.
     2) 3 -> rounds off to a point, but leave blank items, blank
     3) $ -> enters $ in front of the number!    
    */



    //trial1
    System.out.println("DecimalFormat Trial#1 ");
    DecimalFormat trial1 = new DecimalFormat(".00");
    
    System.out.println(trial1.format(a));
    System.out.println(trial1.format(b));
    System.out.println(trial1.format(c));
    System.out.println(trial1.format(d));
    System.out.println();
    //trial2 
    System.out.println("DecimalFormat Trial#2 ");
    DecimalFormat trial2 = new DecimalFormat("00.00");
    
    System.out.println(trial2.format(a));
    System.out.println(trial2.format(b));
    System.out.println(trial2.format(c));
    System.out.println(trial2.format(d));
    System.out.println();
    //trial3 
    System.out.println("DecimalFormat Trial#3 ");
    DecimalFormat trial3 = new DecimalFormat("##.##");
    
    System.out.println(trial3.format(a));
    System.out.println(trial3.format(b));
    System.out.println(trial3.format(c));
    System.out.println(trial3.format(d));
    System.out.println();
    //trial4 
    System.out.println("DecimalFormat Trial#4 ");
    DecimalFormat trial4 = new DecimalFormat("#,###.##");
    
    System.out.println(trial4.format(a));
    System.out.println(trial4.format(b));
    System.out.println(trial4.format(c));
    System.out.println(trial4.format(d));
    System.out.println();
    //trial5 - format it, so its monetary format 
    System.out.println("DecimalFormat Trial#5 ");
    DecimalFormat trial5 = new DecimalFormat("$#,##0.00");
    
    System.out.println(trial5.format(a));
    System.out.println(trial5.format(b));
    System.out.println(trial5.format(c));
    System.out.println(trial5.format(d));
    System.out.println();
    
    
    
    input.close();  
  }//end main 
}//end class
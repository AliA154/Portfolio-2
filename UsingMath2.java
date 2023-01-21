import java.util.Scanner;

public class UsingMath2 {
  public static void main (String[] args) {
  Scanner input = new Scanner(System.in);  
  double numDub;
  int numInt;
    
  //Question 
  System.out.print("Please enter a number, decimlas are allowed: ");
  numDub = input.nextDouble(); 
  numInt = (int)numDub + 3;  
  
  //CAST the number (typeCasting). The compiler will TEMPORARILY 
  //change the varibale type to a selected type of your choice 
  //ex. double into an int.
  
  //Print Stuff
  System.out.println("The entered number was "+numDub);
  System.out.println("Transformed number is "+numInt);
  
  
  
  int a = 7, b = 3;
  
  System.out.println(3 + 3 * 3);// 6 
  System.out.println(a * (a / b));//1 or 1.66666666666
  System.out.println(b / a);//17
  System.out.println( a + 5 * b);//2
  System.out.println('A' + 5);//987
  //System.out.println( z - b ); //984.654
  //System.out.println( (int) z - b); //984
  System.out.println( (double)(a / b) );                   
  System.out.println( (double)a / b );
  
  //Casting???? 
                     
                     
                     
                     
  input.close();
  }//end main
}//end class
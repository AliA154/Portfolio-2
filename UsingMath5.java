import java.util.Scanner;

public class UsingMath5 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in); 
    
//   1) 145 % 10 => 5
//   2) 145 % 100 => 45
//   3) 145 / 10 => 14 truncating the decimlas. 
//   4) 145 / 100 => 1
    System.out.println("145 % 10 = " + (145 % 10) );
    System.out.println("145 % 100 = " + (145 % 100) );
    System.out.println("145 / 10 = " + (145 / 10) );
    System.out.println("145 / 100 = " + (145 / 100) );
  
    /*
     TASK 1 - 
     Have a user enter a 3 digit number. 
     The code will break the number into place value numbers
     ex. 354
     The Hundreds = 3
     The tens = 5
     The ones = 4 
    */ 
   
   int num;
    
    
    System.out.print("Enter a 4 digit number: ");
    num = input.nextInt(); 
    
    System.out.println("You entered "+num); 
    
    System.out.println("Thousands = " + (num/1000));
    int temp = num % 1000;
    System.out.println("Hundreds = " + (temp/100));
    temp = num % 100;//the remainder after dividing by 100
    //System.out.println("********** TEMPORARY NUMBER ************ is "+temp);
    System.out.println("Tens = " + (temp/10));
    temp = temp % 10;//remainder after dividing by 10
    System.out.println("Ones = " + (temp));
    
    //Task 2 - same as above, but with a 4 digit number
    
    
    
    
    
    
    
    
    
    
    input.close();  
  }//end main
}//end class 
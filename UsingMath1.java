import java.util.Scanner;

public class UsingMath1 {
  public static void main (String[] args) {
  Scanner input = new Scanner(System.in);  
  
  int a, b;
  
  System.out.println("Enter a Number for A: ");
  a = input.nextInt();
  System.out.println("Enter a Number for B: ");
  b = input.nextInt(); 
  
  //lets do stuff, do all basic operations + - * /
  System.out.println(a+" + "+b+" = "+ (a + b) );//concatenate  
  System.out.println(a+" - "+b+" = "+ (a - b) );  
  System.out.println(a+" x "+b+" = "+ (a * b) );
  System.out.println(a+" / "+b+" = "+ (a / b) );
  // 3/2 should be 1.5, but the compiler said it was 1?
  //why? because our vatiables are integers..
  // 99/100 = 0.99 -> 0 
  //the compiler TRUNCATES the number... eliemantes all decimals
  //Compiler Assumptions
  //1) using ints in any operation, gives a soultion of an int
  //2) using doubles in any operation, gives a soultion of double 
  //3) have an int and a double, gives a soultion of? double 
  System.out.println("FIXED: "+a+" / "+b+" = "+ ( (a*1.0) / b) ); 
  
  
  input.close();
  }//endmain
}//end class 
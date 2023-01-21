import java.util.Scanner; 

public class UsingMath4 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int num, den;
   
      
   System.out.println("Welcome to Ali's Long Divison Calculator!!!");
   System.out.print("What number is inside the divison symbol?");
   num = input.nextInt();
   System.out.print("What number is outside the divison symbol?");
   den = input.nextInt();





   // 121/3 = 40r1 using long divison. 
   System.out.print("The quoteint of "+num+" and "+den+" using long divison is ");
   System.out.print( num / den +" r");
   //We need to use a new mathematical operator... (+ - * /)
   //Modulo Math... finds the remainder... NOTATION % 
   System.out.println(num % den);
    
    
  
  
    
    
    
    
  input.close();
  }//end main
}//end class 
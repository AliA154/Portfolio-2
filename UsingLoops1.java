import java.util.*;

public class UsingLoops1 {
  public static void main (String[] args) {
    //Declarations 
    Scanner input = new Scanner(System.in);
    int start, end;
    //Counters 
    int count5s = 0; //We declare and iniate the varibale.
    int countGroovy = 0;
    
    
    
    System.out.print("What number should we start at? ");
    start = input.nextInt();
    System.out.print("What number should we end at? ");
    end = input.nextInt(); 
    
    for (int i = start; i <= end; i++) {
      System.out.println(i);
      if (i % 5 == 0) {
        //System.out.println("*** DIVISIBLE BY 5 ***");
        count5s++;
      }
      if (i % 3 == 0 && i % 2 == 0) {
       countGroovy++; 
      }
    }//end for loop 
    
    
    System.out.println("Amount of numbers divisible by 5: "+count5s);
    System.out.println("Amount Groovy numbers: "+countGroovy);
    //TASK 1 ---> how many of the numbers are divisible by 5?
    //Counter -> counts things.
    //TASK 2 --> How many groovy numbers are there, Gtoovy number is a number that is even and divisble by 3
    
  
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     input.close();  
  }//end main
}//end class 
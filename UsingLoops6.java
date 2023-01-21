import java.util.*;

public class UsingLoops6 {
  public static void main (String[] args) {
    //Declarations 
    Scanner input = new Scanner(System.in);
    int goal;//user will enter this info 
    //Counters
    int count = 0;
    //Accumulator 
    int sum = 0;
    
    System.out.print("What is the goal for the sum of the number? ");
    goal = input.nextInt();
    
    if (goal == 0) {
      System.out.println("You entered a 0. The loop ran 0 times!");
    }//looks for goal = 0
    else if (goal < 0) {
     System.out.println("You entered a negative number ! ERROR ERROR"); 
    }//end looking for negative num
    else {
    for (int i = 1; i <= 100; i++) {//declare a local varibale for random number!
      int num = (int)(Math.random() * 5 + 1);
      System.out.println(num);
      sum = sum + num;
      count++;
      if (sum >= goal) {
        break;
        }//end if loop
      }//end for loop
    
    System.out.println("The loop ran "+count+" times");
    }//end else
  
  
  
  
  
  
  
    
    
    input.close();
  }//end main
}//end class 
import java.util.Scanner;

public class UsingLoops2 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int start, amt;
    //Counter
    int countOdd = 0, countEven = 0;
    
    System.out.print("Which number would you like to start from? ");
    start = input.nextInt();
    System.out.print("How many numbers in the range? ");
    amt = input.nextInt();
    
    for (int i = 1; i <= 100; i++) {
     int num = (int)(Math.random() * amt + start);
     System.out.println(num);
     if (num % 2 != 0) {
      countOdd++; 
     }
     if (num % 2 != 0) {
      countEven++; 
     }
    }//end for loop
    System.out.println("Number of odds: "+countOdd);
    System.out.println("Number of evens: "+countEven);
    
    
    //Task 1 --> print out the number of odds that showed up in this random number cycle. 
    //Task 2 --> print out the nummbers of evens that show up. 
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    input.close();  
  }//end main
}//end class 
import java.util.*;

public class TSliders {
  public static void main (String[] args) {
    //Declarations 
    Scanner input = new Scanner(System.in);
    int burgers, total;
    String fries, shake;
    //Accumulator
    String amtBurgers = "";
    //FLAG
    boolean addBurgers = true; 
    //Counter 
    int countBurgers = 0;
    
    
    while (addBurgers == true) {
      System.out.print("Please enter the amount of burgers you would like to order: ");
      burgers = input.nextInt();
      System.out.print("Do you want to order more burgers? YES or NO");
      String choice = input.next().toUpperCase();
      if (choice.equals("NO")) {
        addBurgers = false;
      }//looking for NO
      amtBurgers += (burgers + " ");
      System.out.println();
      countBurgers++;
    }//end while loop
    
    System.out.println(amtBurgers);
    System.out.println("Amount of Burgers: " + amtBurgers);
  
    
    
    
    input.close();  
  }//end main
}//end class 
public class Randnum2 {
  public static void main (String[] args) {
    
    System.out.print("Random number from 0 - 11: ");
    System.out.println((int)(Math.random() * 12));
    
    //TASK 1 -> random number from 1 - 6
    System.out.print("Random number from 1 - 6: ");
    System.out.println((int)(Math.random() * 6 + 1));
    
    //TASK 2 => random number from 10 - 20
    System.out.print("Random number from 10 - 20: ");
    System.out.println((int)(Math.random() * 11 + 10));
    
    //TASK 3 -> random number from 17 - 53
    System.out.print("Random number from 17 - 53: ");
    System.out.println((int)(Math.random() * 37 + 17));
    
    //TASK 4 -> roll 2 6-sided dice. Show the user their roll. if the total of the dice is 2, print SNAKE-EYES
    //if the totoal of the dice is 12, we print BOXCARS
    int dice1 = (int)(Math.random() * 6 + 1);
    int dice2 = (int)(Math.random() * 6 + 1);
    int total = dice1 + dice2;
    System.out.println("You rolled a "+dice1+" and a "+dice2);
    if (total == 2) {
     System.out.println("SNAKE-EYES"); 
    }
    else if (total == 12) {
     System.out.println("BOXCARS"); 
    }
    
    
    
  
  
  
  
  
  
  }//end main
}//end class
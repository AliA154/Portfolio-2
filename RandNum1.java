public class RandNum1 {
  public static void main (String[] args) {
    
    //Math Object there is a method called Math.random()
    System.out.println("Original Math.random() = "+ Math.random() );
    //it makes a decimal ==> double 
    //What is the range of the numbers? 0 to 1 exculsive...
    //TASK 1 -> expand the range 0 - 2...
    System.out.println("Expand range to 0 - 2 = "+ (Math.random()*2 ) );
    //When we mutillied by 2 our rnage increased to 0 to 2 exculsve 
    //TASK 2... Make the numbers an integer..
    System.out.println("Integer Version = "+ ( (int)(Math.random()*2) ) );
    //with a mutiplier of 2 we get values of 0 to 1
    //TASK 3 -> create random num generator that prints number 0,1,2,3,4, or 5
    System.out.println("RNG 0 - 5 = " + ((int)(Math.random()*6) ) );
    
    /*
     Math.random() rules 
     1) by itself it generates a random decinmal from 0-1 exclisiove 
     2) in order to expand, we mutiply by a number. The number determines the amount of unique values the random 
     number genratpr will produce... ex Math.random()* 7 -> 0 -> 6
     3) the mutiplier = the amount of random values possible. 
     4) Addition => pushes the value up or down away from 0.. where the values satrt.
     5) Formula -> (int)(Math.random() * (Last - First + 1) + First);
     */
    
  
    
    
      
  }//end main
}//end class
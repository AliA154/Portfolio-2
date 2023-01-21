import java.util.*;

public class MonsterFighting {
  //**************** METHOD AREA *******************
  public static void greeting() {
    System.out.println("Welcome to Ali's Game of Monsters.");
  }//end greeting
  
  public static void charSel(){
    System.out.println("Which type of Character would like to choose? ");
    System.out.println("STRONG");
    System.out.println("TANK");
    System.out.println("AVERAGE");
   }//end menu
  
  public static String inputWord() {
    Scanner input = new Scanner(System.in);
    String word = input.next();
    input.close(); 
    return word;
  }//end inputWord
  
  public static void prtSol(String word, int num){
    System.out.println("The "+ word + " is equal to " + num);
  }// end
  
  public static void prtSol(String word, double num){
    System.out.println("The "+ word + " is equal to " + num);
  }
  
  public static void strongBuild() {
    
    double num1 = (Math.random() * 4 + 8);
    double num2 = (Math.random() * 5 + 1);
    double num3 = (Math.random() * 3 + 2);
    prtSol("Strength", num1);
    prtSol("Defense", num2);
    prtSol("Speed", num3);
  }//end strongBuild
  
   public static void tankBuild() {
    
    double num1 = (Math.random() * 3 + 2);
    double num2 = (Math.random() * 4 + 8);
    double num3 = (Math.random() * 5 + 1);
    prtSol("Strength", num1);
    prtSol("Defense", num2);
    prtSol("Speed", num3);
  }//end strongBuild
   
    public static void averageBuild() {
    
    double num1 = (Math.random() * 5 + 4);
    double num2 = (Math.random() * 5 + 4);
    double num3 = (Math.random() * 5 + 4);
    prtSol("Strength", num1);
    prtSol("Defense", num2);
    prtSol("Speed", num3);
  }//end strongBuild
  
  public static String userChoose() {
     System.out.print("Please select the the type of monster you would like to choose: ");
     String choice = inputWord();
     return choice;
  }//end useerChoose
  
  public static void payload(String ans){
     if (ans == "STRONG") {
       strongBuild();
  }//end strongBuild();
     else if (ans == "TANK") {
       tankBuild();
  }//end tankBuild();
     else if (ans == "AVERAGE") {
       averageBuild();
     }//end averageBuild();
  }
  //***************END METHOD AREA *****************
  public static void main (String[] args) {
    
  greeting();
  
  while(true) {
      charSel();
      String ans = userChoose();
      payload(ans);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }//end main
}//end class 
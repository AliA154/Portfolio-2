import java.util.*;

public class MonsterGame {
  //**************** METHOD AREA *******************
  public static void greeting() {
    System.out.println("Welcome to Ali's game of Monsters.");
  }//end greeting
  
  public static void charSel(){
    System.out.println("The following are Builds that you can use: ");
    System.out.println("1 - Strong");
    System.out.println("2 - Tank");
    System.out.println("3 - Average");
    System.out.println("0 - Exit");
  }//end charSel
  
   public static String inputWord(){
    Scanner input = new Scanner(System.in);
    String word = input.next();
    input.close();
    return word;
  }//end inputWord
  
  public static void prtSol(String word){
    System.out.println("You Chose the "+ word + " build ");
  }
 
  public static int strongBuild() {
    
    return (int)(Math.random() * 4) + 8;
    return (int)(Math.random() * 5) + 1;
    return (int)(Math.random() * 3) + 2;
    prtSol("Strength");
    prtSol("Defense");
    prtSol("Speed");
      
  }//end strongBuild
  
  
   public static int tankBuild() {
    
    return (int)(Math.random() * 3) + 2;
    return (int)(Math.random() * 4) + 8;
    return (int)(Math.random() * 5) + 1;
    prtSol("Strength");
    prtSol("Defense");
    prtSol("Speed");
  
   }//end strongBuild
   
   
    public static int averageBuild() {
    
    return (int)(Math.random() * 5) + 4;
    return (int)(Math.random() * 5) + 4;
    return (int)(Math.random() * 5) + 4;
    prtSol("Strength");
    prtSol("Defense");
    prtSol("Speed");
   
  }//end strongBuild
   
   public static String userChoose(){
     System.out.print("Please select the build you would like to use: ");
     String choice = inputWord();
     return choice;
   }//end useerChoose
   
   public static void payload(String ans){
     if (ans.toLowerCase().substring(0,3).equals("str")) {
       strongBuild();
     }//end strengthBuild
     else if (ans.toLowerCase().substring(0,3).equals("tan")) {
       tankBuild();
     }//end tankBuild
     else if (ans.toLowerCase().substring(0,3).equals("ave")) {
       averageBuild();
     }//end averageBuild
     else if (ans.toLowerCase().substring(0,4).equals("Exit")) {
       calcExit();
     }//end exit
   }//end payload
   
   public static void info(String bui){
     System.out.println("For "+bui+" you will need to enter str, tan, or ave.");
   }//end info
   public static void calcExit() {
     System.exit(1);
   }//end calcExit()
  //***************END METHOD AREA *****************
  public static void main(String[] args){
    
    greeting();
    
    while(true) {
      charSel();
      String ans = userChoose();
      payload(ans);
    }
    
    
  }//end main
}//end class
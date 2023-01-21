import java.util.*;

public class StringLoops2 {
  public static void main (String[] args) {
    //Declarations 
    Scanner input = new Scanner(System.in);
    String name;
    int len;
    
    
    System.out.print("Please enter your name: ");
    name = input.nextLine();
    len = name.length();
    
    System.out.print("Name written backwards: ");
    for (int i = len - 1;i >= 0; i--) {
      System.out.print(name.charAt(i));
    }//end for loop backwards
    System.out.println();
    
    
    //Task 1 ----> use a new loop, rewrite the name, but with NO vowels!
    //Lebo -> Lb, Sunshine -> Snshn
    
    System.out.print("Name with NO vowels: ");
    for (int i = 0;i < len ;i++) {
      if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
        continue;//is a command that makes the code go to the next iteration of the loop... it goes back to the top.
      }//end of looking for vowels
      else {
       System.out.print(name.charAt(i)); 
    }//end else No vowels
   }//end for NO vowels
   System.out.println();
   
   //Task 2 --> using anew loop, rewrite. Only wit the vowels! include given spaces
   // i.e Sunshine Lebo +> iie eo
   
   System.out.print("Name with ONLY vowels: ");
   for (int i = 0;i < len ;i++) {
      if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u' || name.charAt(i) == ' ') {
        System.out.print(name.charAt(i));
      }//end of looking for vowels
     }//end for ONLY vowels
     System.out.println();
    
  
     
     
     
     
     
     
     
     
     
     
     
     input.close();  
  }//end main
}//end class
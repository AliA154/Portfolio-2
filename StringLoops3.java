import java.util.*;

public class StringLoops3 {
  public static void main (String[] args) {
     //Declarations 
     Scanner input = new Scanner(System.in);
     String name;
     int len;
     
     System.out.print("Please enter your name: ");
     name = input.nextLine();
     len = name.length();
     
     System.out.print("Name replace vowel with !: ");
     String nameLower = name.toLowerCase();
     for (int i = 0;i < len ;i++) {
       if (nameLower.charAt(i) == 'a' || nameLower.charAt(i) == 'e' || nameLower.charAt(i) == 'i' || nameLower.charAt(i) == 'o' || nameLower.charAt(i) == 'u') {
         System.out.print("!");
       }//finds a vowel, replaces with !
       else {
         System.out.print(name.charAt(i));
       }//NOT a vowel
     }//end for loop replace vowel with !
     System.out.println();
     
     //TASK ---> Use a new loop, write the name, but if a letter repeats the one before it, stop writing the name
     // i.e. Michelle => Michel    Nicole => Nicole   Jannet => Jan
     
     System.out.print("Name without repeating letter: ");
     System.out.print(name.charAt(0));
     for (int i = 1;i < len ;i++) {
       if (name.charAt(i) == name.charAt(i - 1)) {
         //System.out.print(" REPEAT ");
         break;//When reached it will stop the loop 
       }//look for repeating 
       else {
         System.out.print(name.charAt(i));
       }//no repeating
     }//end for without repeating letters
     System.out.println();
     
     
     
     //What is the difference between continuie and break? 
  
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     input.close();  
  }//end main
}//end class
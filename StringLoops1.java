import java.util.*;

public class StringLoops1 {
  public static void main (String[] args) {
     //Declarations 
     Scanner input = new Scanner(System.in);
     String name;
     int len;
     
     System.out.print("Please enter your name: ");
     name = input.nextLine();
     len = name.length();
     
     int i;
     for (i = 1; i >= 5;i--) {
      System.out.println(i); 
     }
     
     //Task 1 ----> use the above loop, write the name and the numbers equal to the length of the name. 
     //Task 2 ----> use the above loop, write the name but only 1 letter per line!
     //i.e Lebo
     //L
     //E
     //B
     //O
     // .charAt()
     /* Task 3
        Using the above loop, the name is printed one extras letter per line, until thw whole name is written. 
        i.e Lebo 
        L
        Le
        Leb
        Lebo
        .substring() => start, one after the edning point   
    */
    
    input.close();
  }//end main
}//end class
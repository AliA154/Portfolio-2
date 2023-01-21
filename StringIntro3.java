import java.util.Scanner;

public class StringIntro3 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    String name, monogram, firstInital, lastInital;
    int space;
    
    
    System.out.print("What is your full name? ");
    name = input.nextLine().toUpperCase();
    
    
    System.out.println("Your name is "+name);
    space = name.indexOf(' ');
    firstInital = name.substring(0,1);
    System.out.println("First intial is "+firstInital);
    lastInital = name.substring(space+1, space+2);
    System.out.println("Last inital is "+lastInital);
    monogram = firstInital + lastInital;
    System.out.println("Monogram = "+monogram);    
    

    //task rewrite your full name withour the first and last inital 
    //Ali Ahmad => li hmad .... its all lowercase
    
    System.out.println((name.substring(1, space) + " " + name.substring(space + 2)).toLowerCase());
    
    // Task rewrite your full name only using the first 2 letters of first and last 
    // 2 letter of last name 
    // ex Ali Ahmad 
    // ALAD
    System.out.println(name.substring(0,2) + name.substring(name.length() - 2));
    
    input.close();  
  }//end main
}//end class
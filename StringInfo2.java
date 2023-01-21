import java.util.Scanner;

public class StringInfo2 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    String name; 
    
    System.out.print("Enter your full name: ");
    name = input.nextLine();
    
    System.out.println("Your name is "+name);
    int space = name.indexOf(' ');
    System.out.println("The space is located at index value "+space);
    
    String firstName, lastName;
    
    firstName = name.substring(0,space);//start?
    System.out.println("Your first name is "+firstName);
    lastName = name.substring(space + 1);//starting
    System.out.println("Your last name is "+lastName);
    // use the name James Madison 
    //Jam
    //Mad
    //son
    System.out.println(name.substring(0,3));
    System.out.println(name.substring(6,9));
    System.out.println(name.substring(10,13));
    
    
    
    input.close();  
  }//end main
}//end class 

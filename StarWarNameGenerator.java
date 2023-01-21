import java.util.Scanner;

public class StarWarNameGenerator {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    String firstName, lastName, motherM, city, car;
    
    System.out.print("Enter your first name: ");
    firstName = input.nextLine().toUpperCase();
    System.out.print("Enter your last name: ");
    lastName = input.nextLine().toUpperCase();
    System.out.print("Enter your mother's maiden name: ");
    motherM = input.nextLine().toUpperCase();
    System.out.print("Enter the city you were born: ");
    city = input.nextLine().toUpperCase();
    System.out.print("Enter the first car you drove: ");
    car = input.nextLine().toUpperCase(); 
    
    
    System.out.println("Enter your first name: "+firstName);
    firstName = firstName.substring(0,3);
    System.out.println("The first 3 letters are "+firstName);
    System.out.println("Enter your last name: "+lastName);
    lastName = lastName.substring(0,2);
    System.out.println("The first 2 letters are "+lastName); 
    System.out.println("Enter you mother's maiden name: "+motherM);
    motherM = motherM.substring(0,2);
    System.out.println("The first 2 letters are "+motherM);
    System.out.println("Enter the name of the city you were born: "+city);
    city = city.substring(0,3);
    System.out.println("The first 3 letters are "+city);
    System.out.println("Enter the first car you drove: "+car);
    
    System.out.println("You are " + firstName.substring(0,3) + lastName.substring(0,2) + " " + motherM.substring(0,2) + city.substring(0,3) + " " + "of" + " " + lastName.substring(lastName.length() - 2) + car);
    
    
    
    input.close();  
  }//end main
}//end class 
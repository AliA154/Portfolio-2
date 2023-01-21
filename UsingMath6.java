import java.util.Scanner;

public class UsingMath6 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int timeSec, days, hours, min, sec; 
    
    System.out.print("Enter the amount of seconds: ");
    timeSec = input.nextInt();
    
    System.out.println("You Entered " +timeSec+" seconds");
    
    /*
     User enters a large amount of sec 
     The code will break it down into hours, minuutes, 
     and remainign seconds
     ex. 3671
     hours = 1 
     minutes = 1
     second = 11
    
    RULES: 
    60 seconds = 1 min
    60 min = 1 hour 
    3600 seconds = 1 hour 
    24 hour = 1 day
    24 * 3600 seconds = 1 day
    86400 seconds = 1 day
   */ 
    int temp = timeSec; 
    
    days = temp / 86400;
    temp = temp % 86400;
    hours = temp/3600; 
    temp = temp % 3600;
    min = temp/60; 
    temp = temp % 60; 
    sec = temp;
    
    
    
    System.out.println("Days = "+ days); 
    System.out.println("Hours = "+ hours);
    System.out.println("Minutes = "+ min);
    System.out.println("Seconds = "+ sec);
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      input.close();  
  }//end main
}//end class
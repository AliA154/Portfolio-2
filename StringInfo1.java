import java.util.Scanner;

public class StringInfo1 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    String movie;
    
    System.out.print("What is your favorite movie? ");
    movie = input.nextLine();
    
    System.out.println("Your favorite movie is "+movie);
    int len = movie.length();
    System.out.println("The length of the title is "+ len );
    int index = movie.indexOf('P');
    System.out.println("P is located at "+ index);
    char first = movie.charAt(0);
    System.out.println("The first letter of "+movie+" is "+ first);
    char last = movie.charAt(len - 1);
    System.out.println("The last letter of "+movie+" is "+last);
    
    
    
    /*
       char letter = 'u';     
       String word = "hello";
     
      String uses commands... Mehtods..
      1) .length() => the number of char in the string. 
      2) .indexOf() => finds the index of the FIRST instance of the 
          request value. We canj use either char or string in the ()
          If the result is -1, it means there are no matches!
      3) .charAt(int) => finds the char at a given index value. 
      4) .substring() => use a part of the string...
          a).substring(index) => it will create a string that starts
          at the index pont and continues to the end of the original string
          
          b).substring(start, end) => this will create a string that starts
          at the start point and continues up to the end point. 
      5)  .toUpperCase() => Makes letter capital
      6)  .toLowerCase() => Makes letter lowercase
    
    */
    
    
    
    
    
    input.close();  
  }//end main
}//end class 
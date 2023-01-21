import java.util.Scanner;
import java.text.DecimalFormat;//this is a new import


public class UsingMath8 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in); 
    DecimalFormat df = new DecimalFormat(".000");
    
    double radius, circum, areaCir;
    
    System.out.print("Please enter the radius of the circle: ");
    radius = input.nextDouble();
    
    
    System.out.println("You entered that the radius is "+radius); 
    //Math.PI this is the exact valu8e of pi
    circum = Math.PI * (radius * 2);
    System.out.println("The circumfrence is "+circum);
    //System.out.println(Math.PI);
    areaCir = Math.PI * (radius * radius);
    System.out.println("The area is "+areaCir);
    /* Circles 
     Circumference +> Cherry pies delicous => C = Pi * d
     Area => Apple pies are too => A  = pi * r^2
     */
    System.out.println("The circumfrence is "+ df.format(circum));
    System.out.println("The area is "+ df.format(areaCir));
  
    
    
    
    input.close();  
  }//end main
}//end class 
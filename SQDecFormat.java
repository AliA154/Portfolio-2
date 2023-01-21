import java.util.Scanner;
import java.text.DecimalFormat;

public class SQDecFormat {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in); 
    DecimalFormat df = new DecimalFormat("$#,##0.00"); 
    
    int burger, chicken, fish, nuggets, fries, shakes, sodas ;
    double FinalP, total, tax, burger1 = 1.85, chicken1 = 2.05, fish1 = 1.37, nuggets1 = .20, fries1 = .99, shakes1 = 1.09, sodas1 = .89; 
    
    
    System.out.print("How many Burgers do you want? ");
    burger = input.nextInt();
    System.out.print("How many Chicken Sandwichs do you want? ");
    chicken = input.nextInt();
    System.out.print("How many Filet of Fish do you want? ");
    fish = input.nextInt();
    System.out.print("How many nuggets do you want? ");
    nuggets = input.nextInt();
    System.out.print("How many fries do you want? ");
    fries = input.nextInt();
    System.out.print("How many Milk Shakes do you want? ");
    shakes = input.nextInt();
    System.out.print("How many Sodas do you want? ");
    sodas = input.nextInt();  
    
    System.out.println("Total Burger Price is "+df.format(burger1 * burger)); 
    System.out.println("Total Chicken Sandwich Price is "+df.format(chicken1 * chicken));
    System.out.println("Total Filet of Fish Price is "+df.format(fish1 * fish));
    System.out.println("Total Nuggets Price is "+df.format(nuggets1 * nuggets));
    System.out.println("Total Fries Price is "+df.format(fries1 * fries));
    System.out.println("Total Milk Shake Price is "+df.format(shakes1 * shakes));
    System.out.println("Total Sodas Price is "+df.format(sodas1 * sodas));
    
    System.out.println("Your Order: ");
    System.out.println(burger + " x burger ");
    System.out.println(chicken + " x chicken sandwich ");
    System.out.println(fish + " x filet of fish ");
    System.out.println(nuggets + " x nuggets ");
    System.out.println(fries + " x fries ");
    System.out.println(shakes + " x Milk Shakes ");
    System.out.println(sodas + " x Soda ");
    
    total = (burger1 * burger) + (chicken1 * chicken) + (fish1 * fish) + (nuggets1 * nuggets) + (fries1 * fries) + (shakes1 * shakes) + (sodas1 * sodas);     
    System.out.println("Total = "+df.format(total));
    tax = (total * 0.08); 
    System.out.println("Tax = "+df.format(tax)); 
    FinalP = (total + tax);
    System.out.println("Final Price = "+df.format(FinalP));
    
    input.close();  
  }//end main
}//end class 
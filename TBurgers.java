import java.util.Scanner;

public class TBurgers {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        int Burger = 0;
        int Fries = 0;
        int MilkShake = 0;
        boolean addBurgers = true;
        
        
        
        while (addBurgers == true) {
            System.out.print("Enter the amount of burgers you would like: ");
            int amt = input.nextInt();
            Burger += amt;
        if (amt >= 21) {
           MilkShake++;
           Fries++;
         }
        else if (amt >= 20)
           MilkShake++;
        else if (amt >= 10)
           Fries++;            
        
        System.out.print("Do you want more burgers? (Yes/No): ");
        String choice = input.next().toUpperCase();
        if (choice.equals("NO")) {
          addBurgers = false;
        }
        
        System.out.print("Your order Recipt. \n Number of burgers: " + Burger +
                "\n Number of free Fries: " + Fries + 
                "\n Number of free Milk Shake: " + MilkShake +
                "\n Amount: $" + (Burger * 0.6));
        if(Burger > 57)
            System.out.print("\n YOU BEAT THE BURGER EATING RECORD!!!! ");
     input.close();
    }
  }
}
import java.util.Scanner;

public class UsingMath {
  public static void main (String[] args) {
  Scanner input = new Scanner(System.in); 
     //eating rectnagular pizza 
     //share pizza with friends 
     //we know how big the pizza is
     //how many horizantal and vertical cuts are in the pizza
     //how big is each indivual slice... 
  
   int people; 
   double length, width; 
   int horiz, vert; 
    
   //Questions to poupuate the varuable 
   System.out.print("How many people in total? ");
   people = input.nextInt();
   System.out.print("How wide is the pizza? "); 
   width = input.nextDouble();
   System.out.print("How long is the pizza? ");
   length = input.nextDouble();  
   System.out.print("How many horizonatl cuts into the pizza? ");
   horiz = input.nextInt();
   System.out.print("How many vertical cuts into the pizza? ");
   vert = input.nextInt(); 
   
   
   //Do Stuff 
   //1) what is the area of the pizza 
   double area = length * width;
   System.out.println("The area of the pizza is " + area + "sqft");
   //2) how many slices? cut 3 times horiz 3 vert = 16 
   int slices =(horiz + 1) * (vert + 1); 
   System.out.println("Number of slices = " + slices);
   //3) how many slices per person 
   System.out.println("Number of slices per person = "+ (slices/people) );
   //4) how big is each individual slice
   System.out.println("Size of each slice is "+ (area/slices)+"sqft" );
   
   
   
   input.close();
  }//end main 
}//end class 
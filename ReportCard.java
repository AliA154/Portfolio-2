import java.util.Scanner;

public class ReportCard {
  public static void main (String[] args) {
  Scanner input = new Scanner(System.in);
  
  double math1, math2, math3, english1, english2, english3, history1, history2, history3, sci1, sci2, sci3; 
  
  System.out.println("Enter a Exam Grade from your Math class: "); 
  math1 = input.nextDouble(); 
  System.out.println("Enter another Exam Grade from your Math class: "); 
  math2 = input.nextDouble();
  System.out.println("Enter your last Exam Grade from your Math class: "); 
  math3 = input.nextDouble();
  System.out.println("Enter a Exam Grade from your english class: "); 
  english1 = input.nextDouble(); 
  System.out.println("Enter another Exam Grade from your english class: "); 
  english2 = input.nextDouble();
  System.out.println("Enter your last Exam Grade from your english class: "); 
  english3 = input.nextDouble();
  System.out.println("Enter a Exam Grade from your history class: "); 
  history1 = input.nextDouble();  
  System.out.println("Enter another Exam Grade from your history class: "); 
  history2 = input.nextDouble();
  System.out.println("Enter your last Exam Grade from your history class: "); 
  history3 = input.nextDouble();
  System.out.println("Enter a Exam Grade from your science class: "); 
  sci1 = input.nextDouble();  
  System.out.println("Enter a Exam Grade from your science class: "); 
  sci1 = input.nextDouble();
  System.out.println("Enter another Exam Grade from your science class: "); 
  sci2 = input.nextDouble();
  System.out.println("Enter your last Exam Grade from your science class: "); 
  sci3 = input.nextDouble();
  
  
  System.out.println(math1);
  System.out.println(math2);
  System.out.println(math3);
  System.out.println(history1);  
  System.out.println(history2);
  System.out.println(history3);
  System.out.println(english1);  
  System.out.println(english2);
  System.out.println(english3);
  System.out.println(sci1);
  System.out.println(sci2);
  System.out.println(sci3); 
  
  System.out.println("The Average Grade For Your Math Class is "+(math1 + math2 + math3) / 3);
  System.out.println("The Average Grade For Your History Class is "+(history1 + history2 + history3) / 3);
  System.out.println("The Average Grade For Your English Class is "+(english1 + english2 + english3) / 3);
  System.out.println("The Average Grade For Your Science Class is "+(sci1 + sci2 + sci3) / 3);
  
  System.out.println("The Overall Average of All Your Classes is "+(english1 + english2 + english3 + history1 + history2 + history3 + math1 + math2 + math3 + sci1 + sci2 + sci3) / 12);
  
  System.out.println("Overall grades between 90-100 receive an A\n"+"Overall grades between 80-89 receive an B\n"+"Overall grades between 70-79 receive an C\n"+"Overall grades between 65-69 receive an D\n"+"Overall grades below 65 receive an F");
  
  input.close();
  }//end main 
}//end class 
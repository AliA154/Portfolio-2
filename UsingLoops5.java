public class UsingLoops5 {
  public static void main (String[] args) {
    //Declarations 
    //Counters 
    int countEven = 0, countOdd = 0;
    //Accumulator
    int totalEven = 0;//Sum of all evens... 6... 4... 8
    int totalOdd = 0;
    
    for (int i = 1; i <= 100; i++) {
      int num = (int)(Math.random() * 10 + 1);
      System.out.println(num);
      if (num % 2 == 0) {
        countEven++;
        totalEven = totalEven + num; //totalEven+=num; -------> SHORTER WAY 
      }//look for even
      else {
       countOdd++;
       totalOdd = totalOdd + num;
      }
    }//end loop
    
    System.out.println("Number of evens: "+countEven);
    System.out.println("Number of odds: "+countOdd); 
    System.out.println("Sum of all evens numbers: "+totalEven);
    System.out.println("Sum of all odds numbers: "+totalOdd);
    if (totalEven>totalOdd) {
     System.out.println("Lebo's therom is proven"); 
    }
    else {
     System.out.println("There might have been a miscalculation to disprove Lebo's therom"); 
    }

    //Question.. if i add all the evens numbers that come up.. will the sum 
    //always be larger that the sum of all the odds!!
    //prove this.. we need technology.. new tings.. new ideas!!!!
     //NEW loop item... ACCUMULATOR...
   
 
  
  
  
  
  
  
  
  
  
  }//end main
}//end class 
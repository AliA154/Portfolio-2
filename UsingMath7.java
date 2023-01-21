import java.util.Scanner;

public class UsingMath7 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in); 
    int num;
    
    System.out.print("Pleae enter a number:: ");
    num = input.nextInt();
    
    
    System.out.println("Original number is "+num);
    num+=1;//num = num + 1;//write without repetion 
    System.out.println("The number increased by 1 is "+num);
    num++;//num = num + 1;
    System.out.println("The number again increased by 1 is "+num);
    num*=3;//num = num * 3;
    System.out.println("The number tripled is "+num);
    num*=2;//num = num * 2;
    System.out.println("The number doubled is "+num);
    num-=10;//num = num - 10;
    System.out.println("The number lowered by 10 is "+num);
    num-=1;//num = num - 1;
    System.out.println("The number lowered by 1 is "+num);
    num--;//num = num - 1;
    System.out.println("The number lowered by 1 again is "+num);
    num/=2;
    System.out.println("The number halved is "+num); 
    /*
     RULES for SHOURTCUTS 
     var++ => increase the var by 1 
     var-- => decrease the var by 1
     var+=# => increase by # 
     var-=
     var*=
     var/=
    */
    input.close();  
  }//end main
}//end class 


100
102
100
50 
50
150 
153 
163 
1630 
8150 
8155 
8150 
8140
8137 
2712
904 
90r4
















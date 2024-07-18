import java.util.Scanner;

public class helloworld 
{  
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in); 
        
    System.out.print("Enter your marks in subject 1");
    
        int sub1 = input.nextInt();
    System.out.print("Enter your marks in subject 2");    
        int sub2 = input.nextInt();
        sub1=sub1+sub2;

        System.out.print("the total is " + sub1); 
    } 
} 
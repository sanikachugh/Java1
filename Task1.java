import java.util.Scanner;

public class Task1
{  
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second  number : ");
        int num2 = input.nextInt();
        int a = input.nextInt();
        int s = input.nextInt();
        int m = input.nextInt();
        int D = input.nextInt();
        
        a = num1+num2;
        s = num1-num2;
        m = num1*num2;
        D = num1/num2;
       
        
        
        System.out.println(a + s + m + D);
        
        
    }
}
import java.util.Scanner;

public class Task2
{  
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter the first number : ");
        int num = input.nextInt();
        int newnum = input.nextInt();
        newnum= ++num;
        newnum2= num++;
        newnum3= num--;
        newnum4= --num;
        System.out.print(newnum);
        System.out.print(newnum2);
        System.out.print(newnum3);
        System.out.print(newnum2);
        System.out.print(newnum4);
    }
}    

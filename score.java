import java.util.Scanner;

public class score
{  
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks in maths out of 100 : ");
        int maths   = input.nextInt();
        System.out.print("Enter the marks in english out of 100 : ");
        int english = input.nextInt();
        System.out.print("Enter the marks in science out of 100 : ");
        int science = input.nextInt();

        int total = maths + english + science;
        float score = total/3;
        if (score>=90.0)
        System.out.println("A");
        else if (score >= 80.0) 
        System.out.println("B");
        else if (score >= 70.0) 
        System.out.println("C");
        else if (score >= 60.0) 
        System.out.println("D");
        else 
        System.out.println("F");  
        
        
         
    }
}
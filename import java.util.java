import java.util.Scanner;

public class World 
{  
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter the number of seconds: ");
        int seconds = scanner.nextInt();
        
     
        int min = seconds / 60;
        int sec = seconds % 60;
        
        
        System.out.println("There are " + min + " minutes and " + sec + " seconds in " + seconds + " seconds.");
        
         
    }
}
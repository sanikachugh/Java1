import java.util.Scanner;

public class winner 
{  
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in);  
        
       
        System.out.println("Enter your the first digit of your guess: ");
        
        int firstdigit_guess = input.nextInt();
        System.out.println("Enter your the second digit of your guess: ");

     
        int seconddigit_guess = input.nextInt();

        int firstdigit_lottery  = (int)(Math.random()*10);
        int seconddigit_lottery  = (int)(Math.random()*10);

       
        System.out.println("The lottery number is " +firstdigit_lottery+seconddigit_lottery);

       
        if (firstdigit_guess == firstdigit_lottery & seconddigit_guess == seconddigit_lottery) {
            System.out.println("Exact match: you win Rs 10,000!");
        } 
        else if (seconddigit_guess == firstdigit_lottery && firstdigit_guess == seconddigit_lottery) {
            System.out.println("Match all digits: you win Rs 3,000!");
        } 
        else if (firstdigit_guess == firstdigit_lottery || firstdigit_guess == seconddigit_lottery || seconddigit_guess == firstdigit_lottery || seconddigit_guess == seconddigit_lottery) {
            System.out.println("Match one digit: you win Rs 1,000!");
        } 
        else {
            System.out.println("Sorry, no match.");
        }
    } 
}           

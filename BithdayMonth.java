import java.util.Scanner;

public class BithdayMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer  = 0; 
        int month = 0;
        //Show user a msg to display the set
        System.out.println("Is your birthday month in this SET 1 - 1 3 5 7 9 11, Press 1 for YES and 0 for NO");
        answer = input.nextInt(); //get user input
        if(answer == 1){
        month = month + 1;
        }
        System.out.println("Is your birthday month in this SET 2 - 2 3 6 7 10 11, Press 1 for YES and 0 for NO");
        answer = input.nextInt();
        if(answer == 1){
        month = month + 2;
        }
        System.out.println("Is your birthday month in this SET 3 - 4 5 6 7 12, Press 1 for YES and 0 for NO");
        answer = input.nextInt();
        if(answer == 1){
        month = month + 4;
        }
        System.out.println("Is your birthday month in this SET 4 - 8 9 10 11 12, Press 1 for YES and 0 for NO");
        answer = input.nextInt();
        if(answer == 1){
        month = month + 8;
        }
        System.out.println("Your birthday month is: " + month);
        int answer2 = 0;
        int birthdate = 0;
        System.out.println("Is your birthday date in this SET 1 - 1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 , Press 1 for YES and 0 for NO");
        answer2 = input.nextInt(); //get user input
        if(answer2 == 1){
        birthdate = birthdate + 1;
        }
        System.out.println("Is your birthday date in this SET 2- 2 3 6 7 10 11 14 15 18 19 22 23 28 29 30 31 , Press 1 for YES and 0 for NO");
        answer2 = input.nextInt(); //get user input
        if(answer2 == 1){
        birthdate = birthdate + 2;
    
        }
        System.out.println("Is your birthday date  in this SET 3 - 4 5 6 7  12 13 14 15 20 21 22 23 28 29 30 31 , Press 1 for YES and 0 for NO");
        answer2 = input.nextInt(); //get user input
        if(answer2 == 1){
        birthdate = birthdate + 4 ;
        }
        System.out.println("Is your birthday date in this SET 4 - 8 9 10 11 12 13 14 15 24 25 26 27 28 29 30 31 , Press 1 for YES and 0 for NO");
        answer2 = input.nextInt(); //get user input
        if(answer2== 1){
        birthdate = birthdate + 8;
        }
        System.out.println("Is your birthday date in this SET 5 - 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 , Press 1 for YES and 0 for NO");
        answer2 = input.nextInt(); //get user input
        if(answer2 == 1){
        birthdate = birthdate + 16;
        

        
        }
        System.out.println("Your birthday date  is: " + birthdate);

    }
    
}
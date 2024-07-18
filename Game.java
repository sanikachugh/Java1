import java.util.Scanner;


public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many players want to play this game"); 
        int players= scanner.nextInt();

        for(int i = 1;i<=players;i++) {
        System.out.println("Game starts for player "+i ); 
        
        System.out.println("enter your number"); 
        int userinput= scanner.nextInt();
        int secretnumber= (int)(1+(Math.random()*100));
        int count=1;
        while(secretnumber != userinput){

           
            if(secretnumber < userinput){
            System.out.println("Too high,Try again");
            userinput = scanner.nextInt();
            count++;
        }
            else{
            System.out.println("Too low ,Try again");
            userinput = scanner.nextInt();
            count++;
        }

    }
    
    System.out.println("You hae guessed correctly");
    System.out.println("your total number of attemts were"+count);
        }
    }
}      

        
        
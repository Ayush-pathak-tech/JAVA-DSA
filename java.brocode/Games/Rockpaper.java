
import java.util.Random;
import java.util.Scanner;

public class Rockpaper {
    public static void main(String[] args) {
        
        // ROCK PAPER SCISSORS GAME
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int random = rd.nextInt(3);// to generate random index

        String[] choices = {"rock","paper","scissors"};// for computer

        String playerChoice;
        String computerChoice;
        String playAgain ="yes";
        
        do { 
            System.out.print("Enter your move (rock,paper,scissors):");
        playerChoice = sc.nextLine().toLowerCase();

        if(!playerChoice.equals("rock") && 
        !playerChoice.equals("paper") && 
        !playerChoice.equals("scissors")){
            System.out.println("INVALID CHOICE!");
        }

        computerChoice = choices[random];// random index dega or choices vo array dega
        System.out.print("Computer choice: "+computerChoice);


        if(playerChoice.equals(computerChoice)){ // value of computerChoice  
                 System.out.println("\nIt is a tie!");
        }else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) || ((playerChoice.equals("paper") && computerChoice.equals("rock")) || ((playerChoice.equals("scissors") && computerChoice.equals("paper"))))) {
                 System.out.println("\nYou win!");
        }
        // else if (playerChoice.equals("paper") && computerChoice.equals("rock")) {
        //     System.out.println("\nYou win!");
        // }
        // else if (playerChoice.equals("scissors") && computerChoice.equals("paper")) {
        //     System.out.println("\nYou win!");
        
        else
        {
              System.out.println("\nYou lose!");

        }
        System.out.println("Wanna play again (yes/no)");
        playAgain = sc.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));// while ki condition ager true hai to fir se , nhi to bahar loop ke 

        sc.close();

        
        // DECLARE VARIABLES
        // GET CHOICE FROM THE USER
        // CHECK RANDOM CHOICE FOR THE COMPUTER
        // ASK TO PLAY AGAIN
        // GOODBYE MESSEGE
    }
}
    


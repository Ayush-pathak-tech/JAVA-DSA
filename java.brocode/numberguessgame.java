
import java.util.Random;
import java.util.Scanner;
public class numberguessgame {
    public static void main(String[] args) {
               Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int Guess;
        int randomNumber= random.nextInt(1,11);
        int attempts = 0;
        System.out.println("Number guessing game");
        System.out.println("Guess nuber between 1-10 : ");


         do { 
              System.out.println("Enter a Guess");
              Guess = sc.nextInt();
              attempts ++;
              if(Guess < randomNumber){
                System.out.println("TOO LOW! try again");
              }
              else if(Guess > randomNumber){
                System.out.println("TOO HIGH! try again");
              }
              else{
                System.out.printf("YOU have won , you choosen right Guess number %d that is equal to random Number %d",Guess,randomNumber);
                System.out.println("# number of attempts "+attempts);
              }
        
         } while (Guess != randomNumber);

        



        
    }
}

import java.util.Random;
import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int guess,attempts = 0, min=1,max=10, randomNumber =  random.nextInt(min,max);
       System.out.println("Let's play , LOVELY GAME WITH YOU ❤️ BUDDY");

        do { 
            System.out.print("Enter a guess : ");
            guess = sc.nextInt();
            attempts++;
            if(guess<randomNumber ){
                System.out.println("TOO LOW ! , Try again laudu ");
                System.out.println("Rukna mt ab  try ker");
            }
            else if(guess > randomNumber ){
                System.out.println(" TOO HEIGH ! , Try again  laudu");
                System.out.println("Rukna mt ab try ker;");
                
            }
            else {
                System.out.printf("🎉 You are correct! The number was %d. Attempts taken: %d\n", guess, attempts);
            }
         
            


            
        } while (guess != randomNumber);
        











        
    }
}

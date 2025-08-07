
import java.util.Scanner;


public class quizgame {
    public static void main(String[] args) {

        String[] questions = {"1.What is the main function of router?",
                              "2.Which part of the computer is considered the brain",
                              "3.What year was Facebook lunched?",
                              "4.Who is known as the father of computer?",
                              "5.What was the first programming language?"};

         String[][] options ={{"1.Storing files","2.Encrypting data","3.Directing internet traffic","4.Managing passwords "}
                             ,{"1.CPU","2.HD","3.RAM","4.GPU"},
                              {"1.2000","2.2004","3.2006","4.2008"},
                            {"1.Steve jobs","2.Bill gates","3.Alan Turing","4.Charles Babbage"},
                        {"1.COBOL","2.C","3.Fortrain","4.Assembly"},};                     


        int [] answer = {3,1,2,4,3};
        int score = 0;
        int guess;


        Scanner sc = new Scanner(System.in);

        System.out.print("*****************************\n");
        System.out.print("Welcome to the java quiz game!\n");
        System.out.print("******************************\n");

        for(int i =0; i<questions.length;i++){
            System.out.println(questions[i]);
            for(String option : options[i]){ //for each
                System.out.println(option);///////////////////////////////////to print questions and options
            }
            System.out.print("Enter you guess: ");
            guess = sc.nextInt();
            if(guess==answer[i]){
                System.out.println("_________");
                System.out.println("CORRECT!");
                System.out.println("__________");
                score++;
            }
            else{
                System.out.println("______");
                System.out.println("WRONG!");
                System.out.println("_______");
            }
        }
        System.out.println("Your final score is: "+score+" out of "+questions.length);
       

        // System.out.println("1. Storing files");
        // System.out.println("2.Encrypting data");
        // System.out.println("3.Directing internet traffic");
        // System.out.println("4.Managing passwords");
        // System.out.println("Your guess");
        // int guess = sc.nextInt();

        // JAVA QQUIZ GAME

        
        // QESTION array[]
        // OPTIONS array[]
        // Declare VARIABLES
        // WELCOME MESSAGE
        // QUESTION (LOOP)
        // OPTIONS
        // GET GUESS FROM USER
        // CHECK OUR GUESS
        // DISPLAY FINAL SCORE

    }

    
}

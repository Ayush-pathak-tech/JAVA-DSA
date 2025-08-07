
import java.util.Scanner;

public class whileloop {       // repeat works ke liye use hota hai

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String name = "";
        // while(name.isEmpty()){
        //     System.out.print("ENter your name");
        //     name = sc.nextLine();
        // }
        // System.out.println("Hello "+name);




        //************************************************ */



        // infinite loop

        // while (1==1) { 
        //     System.out.println("help i am stuck in a loop!");  
        // }

        // **********************************************

        // String response = "";
        // while(!response.equals("Q")){
        //     System.out.println("You are playing a game");
        //     System.out.println("Press Q to quit: ");
        //     response = sc.next().toUpperCase();
        // }
        // System.out.println("you have quit the game");

        // ******************************************************

        // Do while loop
        int number = 0;
      do{
            System.out.println("Enter a number between 1 - 10 :");
            number = sc.nextInt();
        }while( number<1 || number >10);

        System.out.println("You picked "+number);
       
  sc.close();
    }
}

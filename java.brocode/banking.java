import java.util.Scanner;

public class banking {
        static Scanner sc = new Scanner(System.in);
        
        //❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥
        //when you have to take user input many times then you should write Scanner in also class
    // java banking program for beginer 🎯🎯🎯🎯
    // 😎😎😎😎😎😎😎😎😎😎😎😎😎😎😎😎😎😎😎
    // declare variable
    // diplay manu
    // get and process users choice  
    // show balance
    // deposite()
    // withdraw()
    // exit message
   
   
   
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 34.3333333333333344444444;
        boolean isRunning = true;
        int choice;

        
        while (isRunning) { 

        System.out.println("***************");
        System.out.println("BANKING PROGRAM");
        System.out.println("****************\n");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposite ");
        System.out.println("3. Withdraw ");
        System.out.println("4. Exit");
        System.out.println("*****************\n");





        System.out.println("Enter your choice between 1-4 : ");
         choice =sc.nextInt();

        switch (choice) {
            // case 1 -> System.out.println("Show me Balance");
            // case 2 -> System.out.println("Deposite");
            // case 3 -> System.out.println("Withdraw");
            // case 4 -> isRunning = false;
            // default -> System.out.println("INVALID CHOICE");

             case 1 -> showBalance(balance);
            case 2 -> balance += deposite();               // kitna paisa dalle
            case 3 -> balance -= Withdraw(balance);
            case 4 -> isRunning = false;
            default -> System.out.println("INVALID CHOICE");

        }   
        }

        System.out.println("____________________________");
        System.out.println("THANK YOU ! have a nice day!");
        System.out.println("__________________________");

       sc.close();
        }
        

         static void showBalance(double balance){
            System.out.println("***************");
            System.out.printf("$%.2f\n",balance);
    }

        static double deposite(){
            System.out.println("Enter an amount to be deposite :");
            double amount = sc.nextDouble();
            if (amount<0) {
                System.out.println("Amount can't be negative ");
            }
            else{
               return amount;
            }
            return 0;
        }

        static double Withdraw(double balance){
            System.out.printf("Enter amount to Withdraw from account");
            double amount=sc.nextDouble();

            if (amount >  balance) {
                System.out.println("INSUFFICIENT FUNDS");
                return 0;
                
            }
            else if(amount <0){
                System.out.println("Amount can't be negative");
                return 0;
            }
            else{
                return amount;
            }

                
            
        }



    }


   

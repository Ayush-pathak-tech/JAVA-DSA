import java.util.Scanner;
public class weightconversion {
    public static void main(String[] args) {
        // WEIGHT CONVERSION


        //Declare variables

        // welcome message

        // prompt for user choice

        //option 1 convert lbs to kgs 

        // option 2 convert kgs to lbs

        // else print not valid choice


        double weight;
        int choice;

        Scanner sc = new Scanner(System.in);

        System.out.println("choose any one option for conversion");

        System.out.println("option 1 : conver lbs to kgs");
        System.out.println("option 2 : convert kgs to lbs ");
        choice = sc.nextInt();

        if(choice == 1){
            System.out.println("Enter the weight in lbs");
            weight = sc.nextDouble();
            weight = weight * 0.453592;
            System.out.printf("the weight in kgs is : %.2f ", weight);

        }
        else if (choice ==2){
             System.out.println("Enter the weight in kgs");
            weight = sc.nextDouble();
            weight = weight * 2.20462;
            System.out.printf("the weight in lbs1 is : %.2f ", weight);

        }
        else{
            System.out.println(" THAT was not a valid choice");
        }

        sc.close();

















    }

}

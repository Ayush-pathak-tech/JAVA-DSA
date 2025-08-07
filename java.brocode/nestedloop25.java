
import java.util.Scanner;

public class nestedloop25 {
    public static void main(String[] args) {
        // nested loop = A loop inside another loop
        // used often with matrix or DS&A
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();

        System.out.println("Enter number of coloums");
        int coloums = sc.nextInt();

        System.out.println("ENter the symble for matrix");
        char symble = sc.next().charAt(0);
        
        for (int i = 0 ; i<rows ; i++) {   // ye dekhta hai ki row kitni baar banega
            for(int j = 0 ; j< coloums ; j++){ // ye dekhta hai ki kya print kerna hai aur kitni baar
               System.out.print(symble + " ");
            }
             System.out.println();
        }

    }
    
}

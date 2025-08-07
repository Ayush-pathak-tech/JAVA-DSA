
import java.util.Scanner;



public class Array2D {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter rows");
        // int rows = sc.nextInt();
        // System.out.println("Enter colums");
        // int colums = sc.nextInt();
        // int numbers[][] = new int[rows][colums];

        // for (int i = 0; i < rows; i++) {
        //     for(int j=0; j<colums;j++){
        //         numbers[i][j]=sc.nextInt();
        //     } 
        // }
        // for (int i = 0; i < rows; i++) {
        //     for (int j= 0; j < colums; j++) {
        //         System.out.print(numbers[i][j]+" ");
        //     }
        //     System.out.println();
        // }  
//********************************************************* */

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter rows and colns");
         int rows = sc.nextInt();
         int colns = sc.nextInt();

         int numbers[][] = new int[rows][colns];

         // input
         System.out.println("Enter elements in matrix");
         for(int i = 0; i<rows; i++){
            for(int j=0;j<colns;j++){
                numbers[i][j]=sc.nextInt();

            }
         }
         System.out.println("Enter number x");
         int x = sc.nextInt();

         // output
         for(int i=0;i<rows;i++){
            for(int j=0; j<colns;j++){
                if(numbers[i][j]==x){
                    System.out.print("Index number is : " +i+j);
                }
                // System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
         }
         














    }
    
}

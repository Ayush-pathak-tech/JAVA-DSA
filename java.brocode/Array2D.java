
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        
         // 2D array = An array where each element is an array
        //                    Useful for storing a matrix of data

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows");
        int rows = sc.nextInt();

        System.out.println("Enter colums");
        int colums = sc.nextInt();

        int  numbers[][] = new int[rows][colums];
        // int 2DArray[][]= new int[][];

        // input
        for(int i = 0; i<rows; i++){
            for(int j=0; j<colums; j++){
                System.out.println("ENter element for "+i+j);
                numbers[i][j] = sc.nextInt();
            }
        }
        //output
        System.out.println("MATRIX! is");
        for(int i = 0; i<rows; i++){
            for(int j=0; j<colums; j++){
                System.out.print(numbers[i][j]+ " ");
            }System.out.println();
        } 
        
        



    }
    
}

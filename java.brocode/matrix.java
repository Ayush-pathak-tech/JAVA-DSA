
import java.util.Scanner;


// import java.util.Scanner;

// public class matrix {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("MATRIX");
//         System.out.println("ENter number of rows");
//         int rows = sc.nextInt();
//         System.out.println("Enter number of colums");
//         int coloum = sc.nextInt();
//         System.out.println("ENteer any simble foe matrix");
//         char simble = sc.next().charAt(0);
//         for(int i = 0; i<rows ; i++){            /// 1 row ---> ☻ ☻ ☻ ☻ ☻     5 coloum
//             for(int j=0 ; j<coloum ; j++){
//                 System.out.print(simble+" ");
//             }
//             System.out.println();
            
//         }

//     }
// }

public class matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("MATRIX IS!");
        System.out.println("enter number of rows");
        int rows=sc.nextInt();
        System.out.println("Enter number of colums");
        int coloum=sc.nextInt();
        System.out.println("Enter sible which you want to print in matrix formate");
        char simble=sc.next().charAt(0);

        for(int i=0;i<rows; i++){
            for(int j=0;j<coloum;j++){
                System.out.print(simble+" ");
            }
            System.out.println();
        }









    }


}

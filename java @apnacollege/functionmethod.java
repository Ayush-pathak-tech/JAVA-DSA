
import java.util.Scanner;

public class functionmethod {
    public static void printMyName(Strings name){
        System.out.println(name);

    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static double multiplicationOf2Numbers(int a, int b){

        return a*b;
    }
    public static int printfactorial(int num){

        int factorial = 1;
        for(int i=num; i>=1; i-- ){
            factorial = factorial*i;
            
        }
        return factorial;
    }
    public static void factorial(int num){
        int factorial = 1;
        for(int i=num; i>=1;i--){
            factorial = factorial*i;
        }
    }
    






    public static void main(Strings[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("ENter you name");
    //    String name = sc.nextLine();
    //    printMyName(name);

    //    System.out.println("Sum "+sum(1,2));

    //    System.out.println("multiplication of two number is: "+multiplicationOf2Numbers(34,54));

       System.out.println("for factorial input any number");
       int input=sc.nextInt();

       System.out.println("factorial :"+printfactorial(input));

        
    }
     
    
}

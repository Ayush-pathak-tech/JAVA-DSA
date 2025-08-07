
import java.util.Scanner;

public class examplearray {
    public static void main(Strings[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        System.out.print("enter inputs of array ");
        for(int i = 0; i<size; i++){
             numbers[i] =sc.nextInt();
        }

        System.out.println("Enter the value of X");
        int x = sc.nextInt();


        for(int i =0; i<size; i++){
            if(numbers[i]==x){
                System.out.println("x found of index "+i);
                break;

            }
            
        }
        
        














    }
    
}

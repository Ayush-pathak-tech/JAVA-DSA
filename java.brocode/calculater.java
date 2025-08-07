import java.util.*;
public class calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        Double num1 = sc.nextDouble();

        System.out.println("Enter an operator (+ , - , * , / , ^): ");
         char operator = sc.next().charAt(0);

        System.out.println("Enter second number");
        double num2 = sc.nextDouble();

        double result=0;
        boolean validOperation = true;

        switch(operator) {

            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2==0){
                    System.out.println("Can't divide by zero ");
                    validOperation = false;
                }
                else{
                    result = num1/num2;
                }
            }
            case '^' -> result = Math.pow(num1,num2);
            default -> {
                System.out.println("Invalid operator!");
            validOperation = false;


            } 

           

        }
        if (validOperation){
             System.out.println(result);////////////////////////////////////////////////////
        }

        sc.close();
    }
}

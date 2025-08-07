import java.util.Scanner;
public class Ternaryoperater {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // ternary operater (?) = Return 1 of 2 values if a condition is true

        // variable name = (condition) ? iftrue : iffalse; --------SYNTAX


        int score = 0;

        if(score>60){
            System.out.println("PASS");

        }else{
            System.out.println("FAIL");
        }

                //    |
                //    |
                //    |
                //    |
                //    |
                //    |
                //    |
                //    *
//          ifelse to ternary operater ;

String passOrFail = (score>60) ? " PASS" : " FAIL" ;
System.out.println(passOrFail);



// by ternary operater we can check number is even or odd
         int number = 3;
         String evenOrOdd = (number%2==0) ? " Even" : "Odd" ;
         System.out.println(evenOrOdd);



         int hours  = 13;
         String timeOfDay = (hours < 12) ? "A.M": "P.M";
         System.out.println(timeOfDay);



         int income = 60000;
         double taxRate  = (income >= 40000) ?  0.25 : 0.15;
         System.out.println(taxRate);


        //  if (a > b) {
        //        max = a;
        //            } else {
        //                max = b;
        //                         }

       
        System.out.println("Enter a");
        double a = sc.nextDouble();
        System.out.println("Enter b");
        double b= sc.nextDouble();
         double max = (a>b) ? a : b;
         System.out.println("Max " +max);



    
         int a1 = 10, b1 = 20;
int max1 = (a1 > b1) ? a1 : b1;
System.out.println("Max: " + max1);
    
   //  max = 20;


   // Use a ternary operator to check if a number is even or odd.

System.out.println("Enter a number A to check is it even or odd");
int A = sc.nextInt();
String evenOrOdd1 = (A%2==0) ? "Even" : "Odd";
System.out.println(evenOrOdd1);


// Write a Java program using the ternary operator to find the absolute value of a number.


System.out.println("Enter a number to check is it absolute");
int R = sc.nextInt();
int value = (R<0) ? -R : R;
System.out.println("Absvalue is : "+value);


         sc.close();


    }
}

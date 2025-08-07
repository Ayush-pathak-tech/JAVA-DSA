
import java.util.Scanner;


public class Arrayinput {
    public static void main(String[] args) {

      // String[] foods = {};
      // int nuumOfElemnt =foods.length;
      // System.out.println(nuumOfElemnt);

      /////////////////////////////////
      
      
      // String[] foods = new String[3];/// CREATE AN empty array
   
      Scanner sc = new Scanner(System.in);

      System.out.println("What size of array you want\n");
      int size = sc.nextInt();
      sc.nextLine();///////////////////////////////////////
     

      String foods[] = new String[size];

      for(int i = 0; i<foods.length;i++){
        System.out.println("Enter a food");
        foods[i] = sc.nextLine();
      }
      for (String food: foods){
        System.out.println(food);
        
      }

      // for(int i=0; i<foods.length; i++ ){
      //   System.out.println(foods[i]);// int i=0;---> runs once then condition check
      }
     
    }


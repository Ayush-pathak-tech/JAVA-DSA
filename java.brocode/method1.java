import java.util.*;
public  class method1 {

  // if the method is return type
          
          //       sum3(method)
          //           |
          //       sum(return)  
          //           |
          //        ans(print)       
    
    public static void main(String[] args) {/// java runs first main method
        
    System.out.println(greet());
     System.out.println(sum2());
        sum();
        greeting();
       

        // int answer = sum3(); ----> calling sum3
        int answer = sum3(2,3);
        System.out.println(answer);
        

    }
    //  

    static void sum(){////////////////////////
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = sc.nextInt();
        System.out.println("enter num2");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);/////////////
    }    
    static void greeting(){
         Scanner sc = new Scanner(System.in);
        System.out.println("ENter name");
        String name = sc.nextLine();
        System.out.println("HELLO "+name);
    }
   static int sum2(){///////////////
     Scanner sc = new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = sc.nextInt();
        System.out.println("enter num2");
        int num2 = sc.nextInt();
        int sum2 = num1 + num2;
        return sum2;/////////////
        // System.out.println("this will never execute");
    }
    static String greet(){
        String greeting = "How are you";
        return greeting;
        /*  return 
         greet(method)
           |
         greeting(likha kya  hai)
           |
         messege  ---->  greet ---> greeting ---> how are you (greet ko define kiya aur fir messege ko print kiya)
         */
    }

    // pass the value of num1 num2 when you are caalling the main() method ------> parameter
    //🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯
    static int sum3(int a,int b){
      int sum = a+b;
      return sum;
    }





    }


    
















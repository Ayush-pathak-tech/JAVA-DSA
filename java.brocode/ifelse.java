import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// if statement = perform a block of code if its condition is true
System.out.println("Enter your name:");
String name = sc.nextLine();
    // GROUP 1
   if(name.isEmpty()){
    System.out.println("you did't enter your name!😡🤬");
   }
   else{
    System.out.println("Hello "+name+"!😎");
   }

   System.out.println("enter your age for enrollment 🎯 ");
    int age = sc.nextInt();
    System.out.print("Are you student (true/false 🐻‍❄️)  ");
    boolean isStudent=sc.nextBoolean();
    
    // GROUP 2
    if(age>=65){
        System.out.println("you are senior: ");
    }
    else if (age==0){// we can use many else if condition 
        System.out.println("you new born baby");
    }
    else if( age < 0){
        System.out.println("you are not born yet");
    }
    else if(age>=18){
        System.out.println("you are adult:");
    }
    else{
        System.out.println(" you are a child");
    }

    // GROUP 3
    if(isStudent){
        System.out.println("you are Student");
    }
    else{
        System.out.println("you are not a student");
    }
    
    sc.close();

    }
}

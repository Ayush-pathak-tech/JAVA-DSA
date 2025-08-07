public class first1 {
    public static void main(String[] args) {

        // ❎ variable = A variable in Java is like a container or a box in memory where you store some data.
        //A reusable container for a value.
        //                          A variable behaves as if it was the value it contains.

        // 🟥 Primitive = simple value stored directly in memory (stack)
        // 🟦 Reference = memory address (stack) that points to the (heap)

        // 🟥 Primitive vs 🟦 Reference
        //    ---------                      ---------
        //    int                           string
        //    double                    array
        //    char                        object
        //    boolean

        /* Local Variable
        Declared inside a method         
        used only within that method
        🧐public void show() {
          int x = 10;  // local variable
}


         * Instance variable
         Declared inside a class but outside all methodes
         🧐class Student {
         int rollNo;  // instance variable
}

         * Static variable
         declared with static keyword
         shared by all objects of the class
         🧐static int schoolCode = 123;  // static variable

         * 
         * 
         * 🔐 Rules for Naming Variables
              Must begin with a letter, $, or _

              Can’t start with a number (e.g., 1name ❌)

              Can’t use Java keywords like int, class, public

              Should be meaningful (age is better than a)

              Java is case-sensitive (Age and age are different)

        ▶️2 Steps two create a variable
        1. Declaraton
        2. assignment

         */

        int age = 21;
        int year = 2025;
        int quantity = 1;
        System.out.println(year);
        System.out.println("The year is "+ year);//🎯// means printing the year is 2025
        System.out.println("the year is " + "year");//🎯// means printing the year is year
        
       
        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;
        //used to store decimal numbers
        //✔️ It can store numbers like: 10.5, 3.14159, -99.99, 0.0, etc.
        System.out.println(price);
        // wanna print in doller
        System.out.println("$" + price);
        // if we are storing "integer" result will in "double"(19🔜19.0)





        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        // store a single character — like a letter, symbol, or digit.
        //One single character (like 'A', 'z', '9', '@')
        // ' '
        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);


        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;
        // only have two values:
        //true  ✅
        //false ❌
        // used in dicision making  like yes/no, on/off, pass/fail, win/lose, etc.
        System.out.println(isStudent);
        System.out.println(forSale);
        System.out.println(isOnline);
        /*  🐫 What is camelCase?
         📌 Short Answer:
         camelCase is a naming convention used in programming where:
         🖋️The first word starts in lowercase
         🖋️Each next word starts with an uppercase letter
         🖋️No spaces or underscores are used*///🎯
         if(isStudent){
            System.out.println("you are a student");
         }
         else{
            System.out.println("you are not a student");
         }

         //////////////////////////////////

        String name = "Bro Code";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";
        System.out.println("hello " + name);
        System.out.println("laao " + food);
        System.out.println("Your email is  " + email);
        System.out.println("your t shirt colour is  " + color);
        System.out.println("you are " + age + " years old");
        System.out.println(" you gpa is  " +gpa);
        System.out.println("your average letter grade is " + grade);
        //🎯sequence of characters     (letters, numbers, symbols) — like a word, sentence, or paragraph.
        //🎯datatype                   (start with a capital S because it is a class)
        // " "
        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println(" Your choice is a " +color+ "  tshirt " +car+ " car in " +year);
        System.out.println("The price is: " + currency + price);
        System.out.println(" the price of car " +currency+price);

        if(forSale){
            System.out.println("There is a " + car + " for sale"); // for sale is false then else condition apply hoga
        }
        else{
            System.out.println("The " + car + " is not for sale");
        }
    }
}//🎯🛡️🖋️⏰🛟❌🆗🔜🔚

    // ❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥
//         ✅ 5️⃣ Types of Methods
// ⭐ Based on return type:
// Void methods (do not return anything)
// Return-value methods (return a value)
// ⭐ Based on modifiers:
// Instance methods (require object)
// Static methods (belong to class)
// ⭐ Based on access:
// public, private, protected, default
//🆗🆗🆗🆗🆗🆗🆗🆗🆗🆗🆗🆗🆗🆗🆗🆗🆗🆗🆗🆗🆗🆗🆗🆗🆗
//✔ Every method must be defined inside a class or interface.
//✔ Two methods with 😎same name and same parameters are NOT😎 allowed.

//✔ Static methods belong to the class, called without object.
//✔ Instance methods need object to call.

// ✅ Quick Rules List (Exam-Friendly)
// ⭐ Must be inside a class.
// ⭐ Must have return type (or void).
// ⭐ Must have parentheses.
// ⭐ Parameter types required.
// ⭐ Return type matches return statement.
// ⭐ Overloading = different parameters.
// ⭐ Static = class-level; Instance = object-level.
// ⭐ Modifiers control access.
// ⭐ Method body in {}.
// ⭐ Varargs = one only, last.
// ⭐ Abstract methods = no body, only in abstract class.
// ⭐ Constructors ≠ methods.
// ⭐ No global (top-level) methods.

//🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯
// (name,age)----> parameter
//void ----> method
// static -----> keyword// create a method outside main method
// we need a matching set of parameter(we have to again define here name,age )
// if method return type is void then it will not return any value
//void ----> no return type;
// If the method is static, you can call it directly in main().
// If the method is not static, you need to create an object.
//methodName(arguments); -----> calling method

// method = a block of reusable code that is executed when called()
// method --> called ()
// in programming we like to follow the DRY(don't repeate yourself) principle
// in java the method needs static keyword

//Return Type in Header	return Required?	Example
// void	❌  ----> No value returned	-->  static void show() { }
// int  ✅  ----> Must return an int	-->  static int get() { return 5; }
// String✅  ----->  Must return a String ---> 	static String s() { return ""; }
// boolean✅ ---->  Must return true/false ---->	static boolean b() { return true; }
// basically hum class me formula likhte hai aur main method me us hisab se uska use kerte hai
public class Methods {

    // Static method with void return type
    static void showMessage() {
        System.out.println("Hello! This is a static void method.");
    }

    // Static method with int return type
    static int add(int a, int b) {
        return a + b;
    }

    // Static method with String return type
    static String greet(String name) {
        return "Hello, " + name + "!";
    }

    // Static method with boolean return type
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Static method with double return type
    static double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }

    // main method to call all the above static methods
    public static void main(String[] args) {

        // 1. Calling static void method
        showMessage();

        // 2. Calling static int method
        // int sumResult = add(5, 7);
        System.out.println("Sum of 5 and 7 is: " + add(5, 7));

        // 3. Calling static String method
        // String greeting = greet("Ayush");
        System.out.println(greet("Ayush"));

        // 4. Calling static boolean method
        boolean check = isEven(8);
        System.out.println("Is 8 even? " + check);

        // 5. Calling static double method
        double area = calculateArea(4.5);
        System.out.println("Area of circle with radius 4.5 is: " + area);
    }
}



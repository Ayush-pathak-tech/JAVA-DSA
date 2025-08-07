
public class variable {
    int x = 3;
    public static void main(String[] args) {
        // variable scope = where a variable can be accsesd


        int x = 1;
        // they are like neighours they can't lok inside each othrs house 
        // here one x is in main method and other is in diffrebt method so can not be equal
    }
    //method 1            // Local scope
    //🎯🎯🎯🎯🎯🎯🎯🎯🎯
    
    ///A variable declared inside a method, constructor, or block.
    // Accessible only within that method/block.
    void myMethod() {
    int localVar = 10; // local scope
    System.out.println(localVar);
    // localVar cannot be used outside myMethod
}

// method 2                // Instance Scope
//🎯🎯🎯🎯🎯🎯🎯🎯🎯
// Also called instance variables.
// Declared inside a class but outside methods.
// Each object gets its own copy.

class Person {
    String name; // instance scope

    void setName(String n) {
        name = n;
    }

    void showName() {
        System.out.println(name);
    }
}

//  Class Scope (Static Scope)🎯🎯🎯🎯🎯🎯🎯🎯

// Declared with static keyword inside a class.
// Shared by all objects of the class.
class Student {
    static String schoolName = "ABC School"; // class scope

    void showSchool() {
        System.out.println(schoolName);
    }
}

// 4️⃣ Block Scope🎯🎯🎯🎯🎯🎯🎯🎯🎯
// Defined within curly braces {} like loops or if statements.
// Accessible only inside that block.
for(int i = 0; i < 5; i++) {
    System.out.println(i);
}
// i is not accessible here




    }


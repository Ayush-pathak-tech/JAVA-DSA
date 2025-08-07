import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // array = a collection of values of the same data type
        // * think of it as a variable that can store more than 1 value *
        // An array in Java is a collection of variables of the same data type stored at contiguous memory locations.

        // if we access an array without index it will give you memory address
        String fruits[] = {"apple", "orange", "Banana"}; // array
        System.out.println(fruits[0]); // prints "apple"

        // change the element by index
        fruits[0] = "pineapple";
        System.out.println(fruits[0]);

        // length of an array
        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);

        // print all elements of array using for loop
        // for(int i = 0; i < fruits.length; i++) {
        //     System.out.println(fruits[i]);
        // }

        // print all elements using enhanced for loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // sort --> alphabetically arrangement
        Arrays.sort(fruits); // arranged in alphabetically

        // fill same element
        Arrays.fill(fruits, "pineapple"); // fill all elements with "pineapple"

        // print all elements after fill using enhanced for loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

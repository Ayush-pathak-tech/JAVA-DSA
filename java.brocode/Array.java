
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
         // array = a collection of values of the same data type
        //              * think of it as a variable that can store more than 1 value *
        //An array in Java is a collection of variables of the same data type stored at contiguous memory locations.

        // if we acess an array without index it will give you memory address
        String fruits[] = {"apple","orange","Banana",}; // array
        System.out.println(fruits);//[Ljava.lang.String;@4517d9a3

        // chnage the element by index
        fruits[0]= "pineapple";
        System.out.println( fruits[0]);

        // length of an array
        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);

        // if you need to print all of element of array use for loop
        for(int i=0; i<fruits.length;i++){
            System.out.println(fruits[i]);

            // 
        }
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        // sort --> alphabetically arrengement
        //🎯
        Arrays.sort(fruits);/// aranged in alphabetically
        Array.fill(fruits,"pineapple");// fill same element

        // enhanced , for each loop ----“for each element in collection, do something.”
        for(String fruit : fruits){// fruits ka her ek element fruit ko assign hota line by line aur print ho jata hai;
            System.out.println(fruit);// for each loop

        }



    }

    private static void fill(String[] fruits, String pineapple) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

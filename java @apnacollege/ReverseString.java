public class ReverseString {
    public static void main(String[] args) {

        // // reverse of string 
        // // with help of StringBuilder

        // StringBuilder sb = new StringBuilder("hello");

        // // h --> always front so we have to remove it from back(-1)
        // // sb.length - i(front) 
        // for(int i=0; i<sb.length()/2; i++ ){
        //     // legth/2 --> only half change in string
        //     int front = i;
        //     int back = sb.length()-1-i;// 5-1-0 = 4

        //     char frontChar = sb.charAt(front);
        //     char backChar = sb.charAt(back);

        //     sb.setCharAt(front, backChar);
        //     sb.setCharAt(back, frontChar);

        //     System.out.println(sb);

        //     // time complexity --> O(n)

            //*********************************** */
            //          syntax

            // String name = new StringBuilder("name")

            String original = "Hello";
String reversed = new StringBuilder(original).reverse().toString();
System.out.println(reversed);  // "olleH"


String name = "ayush pathak";
String reverse = new StringBuilder(name).reverse().toString();
System.out.println(reverse);


String name2 = "Akshay";
String revers = new StringBuilder(name2).reverse().toString();
System.out.println(revers);


        }
    }





        











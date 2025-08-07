
public class printfstatement {
   public static void main(String[] args) {
      
       // printf() is a method used to format output

       // % [flags] [width] [.precision] [specifier-character] .... floating style

      

// 🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯
 // [specifier-character]

       String name = "Spongebob";
       char firstLetter = 'S';
       int age = 30;
       double height = 60.5;
       boolean isEmployed = true;

       System.out.printf("Hello %s\n", name);
       System.out.printf("Your name starts with a %c\n", firstLetter);
       System.out.printf("You are %d years old\n", age);
       System.out.printf("You are %f inches tall\n", height);
       System.out.printf("Employed: %b\n", isEmployed);

       System.out.printf("%s is %d years old", name, age);

       // [.precision]  ----- Number of digits after the decimal point

       double price1 = 9.99;
       double price2 = 100.15;
       double price3 = -54.01;

       System.out.printf("%+.3f\n", price1);
       System.out.printf("%+.3f\n", price2);
       System.out.printf("%+.3f\n", price3);

       // [flags]

       // + = output a plus , 	🆗 Always show sign (+ or -)
       // , = comma grouping separator 🆗 ( 10000 🔜 10,000)
       // ( = negative numbers are enclosed in () 🆗 -54.01 🔜 (54.01)
       // space = display a minus if negative, space if positive ( only space when number is positive and negative sign before negative number no space)

       System.out.printf("%f\n", price1);
       System.out.printf("(%.2,f\n", price2);
       System.out.printf("%f\n", price3);

       // [width] ------controls the minimum number of characters(shift)

       // 0 = zero padding
       // positive number = right justified padding without zero
       // negative number = left justified padding

       int id1 = 1;
       int id2 = 23;
       int id3 = 456;
       int id4 = 7890;

       System.out.printf("id: %04d\n", id1);
       System.out.printf("id: %4d\n", id2);
       System.out.printf("id: %04d\n", id3);
       System.out.printf("id: %04d\n", id4);

       // %5d----shift right five times (     42)
       //-flag(left align)---- shift left 5times
       // 0flag = Pad with 0 to make 5 digits---00042
   }
}


import java.util.*;
public class mathexercise {
    public static void main(String[] args) {
    

        // direct values
        //❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥
        System.out.println(Math.PI);// direct value of pi  ---\
        System.out.printf("%.2f" ,Math.E); //euler's number is E  ---/
        //////////////////////////////////////////////////////////////

        double sqrt = Math.sqrt(9);
        System.out.println(sqrt);
        double result;

        result = Math.pow(2,3);
        result = Math.abs(-5);
        //  Absolute Value = Means: It gives the positive value of a number, even if it's negative.
        result = Math.sqrt(9);
        result = Math.round(3.14);
        // roundoff value
        result =Math.ceil(3.14);
        // Ceil =  jump to the next highest whole number
        result = Math.floor(3.99);
        // floor =  Rounds down
        result = Math.max(10,20);
        result = Math.min(10,20);

        System.out.println(result);



    //  HYPOTENUSE C = MATH.sQRT(a²+ b²)   Alt+253
    Scanner sc = new Scanner(System.in);

    double a;
    double b;
    double c;

    System.out.println("Enter the length of side of A:");
    a = sc.nextDouble();

    System.out.println("Enter the length of side of B: ");
    b = sc.nextDouble();

    System.out.println(a);
    System.out.println(b); 
   c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
   System.out.println("The Hypotenuse is : " +c+ "cm");

   // circumference = 2 * MAth.PI * radius;
   //area = Math.PI * Math.pow(radius,2);
   //volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);

   double radius , area,circumference,volume;

   System.out.print("Enter the radius:");
   radius = sc.nextDouble();

   circumference = 2 * Math.PI * radius;
      area = Math.PI * Math.pow(radius,2);
   volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);

     System.out.println("The volume of circle is : " +volume+"cm³"); // alt 0179
   System.out.println("The circumference of circle " +circumference);
System.out.println("The area of cicle is : "+area+"cm²");

// FUTURE TOPIC 



//       REPLACE 🤩println with 🤩printf and after that thee is %.1f

// PRINTF STATEMENT🎯
//one digit displayment 🔜

// System.out.printf("The volume of circle is : %.1fcm" ,volume); // alt 0179
//    System.out.printf("The circumference of circle  %.1fcm²" ,circumference);
// System.out.printf("The area of cicle is : %.1fcm³ ",area);

// 🤩%.1f means .......Print 1 digit after the decimal point. after that it looks like c program








    sc.close();

        


    }
}

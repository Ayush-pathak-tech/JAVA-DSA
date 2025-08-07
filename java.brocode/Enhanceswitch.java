import java.util.*;
public class Enhanceswitch {
    // Enhanced switch = A replacement to many else if statements
//                                    (Java14 feature)
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String day = sc.nextLine();

    switch (day) {
    //    case "Monday" -> System.out.println("It is the weekday🎯");
    //    case "Tueday" -> System.out.println("It is the weekday");
    //    case "Wednesday" -> System.out.println("It is weekday");
    //    case "Thursday" -> System.out.println("It is weekday");
    //    case "Friday" -> System.out.println("It is weekday");

    case "Monday","Tuesday","Wednesday","Thursday","Friday"-> System.out.println("It is weekday");//It’s used to replace the old-style case : + break.
    case "Saturday","Sunday" -> System.out.println("It is weekend");
       default -> System.out.println(day + "is not a day");


    }

}
}

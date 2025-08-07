import java.util.*;
public class tringlearea {
   public static void main(Strings[] args) {
     Scanner sc = new Scanner(System.in);
    
    System.out.println("enter width of triangle : ");
    double width = sc.nextDouble();

    System.out.println("enter height of triangle : ");
    double height = sc.nextDouble();

    double area = width*height*0.5;
    System.out.println("area of triangle : " +area+ " cm²");
    sc.close();
   }

}

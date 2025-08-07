import java.util.Scanner;
public class Temconversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the tempreture to convert");
        double temp = sc.nextDouble();

        System.out.println("Convert to Celsius ot Fahrenheit? (C or F)");
        String unit = sc.next().toUpperCase();

        // Ternary operater
        // ( condition ) ? true : false ;

        // double newTemp = (unit.equals("C")) ?  (temp-32)*5/9 : (temp*5/9)+32;
        // System.out.printf("%.1f°%s" ,newTemp,unit);  // alt + 0176

        double newtemp = (unit.equals("C") ? (temp-32)*5/9 : (temp*5/9)+32);
        System.out.printf("%.2f°",unit);


        sc.close();
    }
}

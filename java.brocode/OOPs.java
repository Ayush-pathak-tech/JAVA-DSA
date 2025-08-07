import java.util.Random;
import java.util.Scanner;

public class OOPs {
    public static void main(Strings[] args) {
        // object = av  entity holds data (attributes)
                    //  and can perform actions (method)
                    //  it is a refrence data type
                Scanner sc = new Scanner(System.in);
                Random rd = new Random();

                Car car = new Car();
                // car.isRunning = true;// to change
                // System.out.println(car.model);
                // System.out.println(car.make);
                // System.out.println(car.price);
                // System.out.println(car.year);
                // System.out.println(car.isRunning);

                // calling method from Car class
                System.out.println(car.isRunning);
                car.start();
                System.out.println(car.isRunning);
                car.stop();
                System.out.println(car.isRunning);

                car.drive();
                car.brake();












    }
    
}

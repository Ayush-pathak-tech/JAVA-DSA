
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String names = "Tony";
        String fullNmae = "Tony Stark";
        String sentence = " My name is Tony Stark";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("You name is: "+name);

        //concatenation--->  Strings ko jodna
        String firstName="tony";
        String lastName="stark";
        System.out.println("Full name is "+firstName+" "+lastName);

        //length
        System.out.println("length of first name is: "+firstName.length());

        

    }
    
}

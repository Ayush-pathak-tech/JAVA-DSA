import java.util.*;
public class madlibs {
    public static void main(String[] args) {
        // MAD LIBS GAME ----😧 story
        Scanner sc = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        // 
        
        System.out.println("Enter an adjective (description): ");
        adjective1=sc.nextLine();
         System.out.println("Enter a noun (animal,person):");
          noun1=sc.nextLine();
          System.out.println("enter an adjective:");
           adjective2=sc.nextLine();
           System.out.println("Enter a verb with -ing (action):");
            verb1=sc.nextLine();
            System.out.println("Enter an adjective:");
             adjective3=sc.nextLine();

        
        System.out.println(" \nToday I went to a " +adjective1+" zoo.");
         System.out.println(" In an exhibit, I sa a "+noun1+".");
          System.out.println(noun1+" was " +adjective2+" and "+verb1+"!");
           System.out.println("I was "+adjective3+"!");




    }
}

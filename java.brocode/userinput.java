import java.util.Scanner;
// import....keyword use when we want to use class or package that is not build in by default
//java.... Main java package
//util.... utility sub-package
//Scanner.... A class inside that package used to take user input
public class userinput {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        // Scanner..... it is class in java it comes from import java.util.Scanner
        //it is used to read input like *String *INT *Double,Boolean
        // scanner*.... this is the name of object
        //new Scanner..... means creating new object
        //System.in..... take input from keyboard  (.in is an input stream)
        System.out.print("Enter your name ");
        Strings name = sc.nextLine();
        //💢 nextline reads spaces in input and give out put with space
        //💢next reads only string not space //scanner.nextLine() → reads full line (like "Ayush Pathak")
        //scanner.nextInt() → reads an integer (like 21)
        System.out.println("enter age of your");
        int age = sc.nextInt();
        System.out.println("What is your gpa");
        double gpa=sc.nextDouble();
        System.out.println("Are you a student (true/false)");
        boolean isStudent = sc.nextBoolean();
         System.out.println("Hello " + name +" you are  "+age+ "  years old and your gpa is  " +gpa);
         System.out.println("Student : " +isStudent);
         if(isStudent){ // isStudent replaced with input like tru and false
            System.out.println(" you are enrolled ");
         }
         else {
            System.out.println(" you are not enrolled");
         }
        
         //////// COMMON PROBLEM ////////
         /// 
         /// After you enter your age (using sc.nextInt()), it skips asking for favorite color and directly prints the last line with color as blank ("").
         ///sc.nextInt() reads the number (like 21), but leaves the newline \n in the input buffer 
         // output sidha puchta nhi next line print ker dea hai 
         //Enter your age
// 15
// Enter your fav color
// hello 15 you are year old
        //  Scanner sc = new Scanner(System.in);

         System.out.println("Enter your age");
         Int age = sc.nextInt();
         
         Scanner.nextLine();

          System.out.println("Enter your fav color");
         Strings color = sc.nextLine();
         
         System.out.println("hello " +color+ " you are "+age+"year old" );
    
//////////////////////////////////////////////////////////////////
//CALCULATE AREA OF A RECTANGLE

        
        System.out.println("Enter the width of tangle : ");
        double width = sc.nextDouble();

        System.out.println("Enter height of trangle: ");
        double height = sc.nextDouble();

        double area=(width*height)/2;
        System.out.println("the area of trangle is : " +area);





        sc.close();
        //used to close the scannner object after you are done using it
    }
}

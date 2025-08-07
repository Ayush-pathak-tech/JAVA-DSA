import java.util.*;
public class logicaloperater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//         In Java, logical operators are used to combine or negate Boolean expressions, allowing conditions to be evaluated together.
// (&& for "and", || for "or") or inverted (! for "not").
    
   double temp = -12; // && logical operater are used to check more than one condition(both must be true)
   // or (||) when only one condition is true
// code will execute when both conditions must be true
boolean isSunny = true;
if (temp <=30 && temp >= 0 && isSunny) {
    System.out.println("temp is good");
    System.out.println("It is Sunny outside");
}  
else if ( temp <=30 && temp >=0 && !isSunny){
    System.out.println("the wather is good");
    System.out.println("it is nt sunny");


} 
else if (temp >=30 || temp <0 ){ // one condition must be true 
    System.out.println("the weather is bad outside");
}

// username must be between 4-12 characters
// user name must not contain spaces or underscore

String username;
System.out.println("Enter your user name");
username = sc.nextLine();

if (username.length() <4 || username.length()>12){
    System.out.println("Username must be between 4-12 characters");
}else if (username.contains(" ") || username.contains("_")) {
    System.out.println("Username must not contain spaces or underscore");
}
else{
    System.out.println("Welcome "+username);
}

    }
    
}

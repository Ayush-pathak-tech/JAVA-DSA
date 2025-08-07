public class arithmatic {
    public static void main(String[] args) {
        // Augmented assignment operators
    int x = 10;
    int y = 2;
    
   
    x +=y; // x = x + y;

    x -=y; // x = x-y;
   
    x *=y; // x = x * y;
   
    x /=y; // x = x / y;
  
    x %= y;  // x = x % y;

    System.out.println(x);

    // Increment and Decrement Operaters
    x++;
    y++;
    x = x + 1;
    // x++;
    x = x - 1;
    // x--;
    x+=2;

    // Order of Operation [P-E-M-D-A-S]
    // Parentheses, Exponents, Multiplication, Division, Addition, Subtraction
    double result = 3 + 4 *(7-5)/2.0;

    System.out.println(result);


        
    }
}

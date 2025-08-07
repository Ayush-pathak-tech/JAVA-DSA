import java.util.*;
public class compinterest {
//   A = Total amount (final amount including interest)
// P = Principal amount (initial money)
// r = Annual interest rate (in decimal, e.g., 10% = 0.10)
// n = Number of times interest is compounded per year
// t = Time in years
//Compound Interest=A−P
public static void main(String[] args) {
double P ;
double r;
double t ;
double A;
double n;

P = 10.34;
r = 1.32;
t=1.4;
n = 4d.,69;

A = P * Math.pow(1 + r/n, n*t);
System.out.println("A is "+A);










 Scanner sc = new Scanner(System.in);
double principalAmount;
double rate ;
int timesCoumpounded;
int years;
double Amount;



System.out.print("Enter the principal amount : /n");
principalAmount = sc.nextDouble();

System.out.println(" Enter the rate in % :/n");
rate = sc.nextDouble()/100;////////////////////

System.out.println(" enter times compound");
timesCoumpounded = sc.nextInt();

System.out.printf("Enter the years" );
years = sc.nextInt();

Amount = principalAmount * Math.pow( 1 + rate/ timesCoumpounded , timesCoumpounded*years );

System.out.printf(" the Amount is %.2f " , Amount);










sc.close();

}

}



 /*Common Format Specifiers in C:
Specifier	Data Type	Example

%d	Integer (int)	10
%f	Float	3.14
%lf	Double	3.141592❤️‍🔥
%c	Character (char)	'A'
%s	String	"Hello"
%u	Unsigned int	100
%ld	Long int🎯	123456789
%lld	Long long int🎯	9223372036854775807
%x	Hexadecimal🎯 (lower)	a1b2
%X	Hexadecimal🎯 (upper)	A1B2
%o	Octal	0755
%%	Prints % symbol	%
*/




import java.util.Scanner;
public class Shoppingcart {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // SHOPPING CART PROGRAM

        System.out.print(" WHAT ITEM WOULD YOU WANT : ");
        String item = sc.nextLine();

        System.out.print(" WHAT IS THE PRICE FOR EACH ITEM : ");
        double price = sc.nextDouble();

        System.out.println("HOW MANY WOULD YOU LIKE? : ");
        int numberOfItem = sc.nextInt();

        double total = numberOfItem*price;

        System.out.println(" You have bought "+numberOfItem+" "+item);
        System.out.println("You total is $"+total);

        sc.close();

    }
}

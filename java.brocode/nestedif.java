public class nestedif {
    public static void main(String[] args) {
        boolean isStudent = false;
        boolean isSenior = true;
       double price = 1000;
       double discount = 0;
        if (isStudent) {
            
            if (isSenior) {
                
                System.out.println(" You get a senior discount of 20%");
                System.out.println(" And you get a student discount of 10%");
                discount = price*0.3;
                System.out.println("discount: " +discount);
                price = price - discount;
                System.out.println("yo have to pay only : " + price);
           
            }
            else{
                System.out.println(" you get 10% discount");
             double dropPrice = price*0.1;
            price = price - dropPrice;
            System.out.println("Now you have to pay only "+price);
            }
            
        }
        else{
           if (isSenior) {

            System.out.println(" you have got senior discount: 20%");
            discount = price*0.2;
            System.out.printf(" Now  you have a discount of : %f\n", discount);
            price = price - discount;
                System.out.printf("you have to pay only   $%f discount of 1000$",price);
           }
           else{
            price = price*1;
            System.out.println("you have to pay " + price);
           }
        }

       
    }
}

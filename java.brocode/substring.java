import java.util.Scanner;
public class substring {
    public static void main(String[] args) {
         



// .substring() = A method used to extract a portion of a string
        //                         .substring(start, end)

       // String sub = originalString.substring(startIndex)🆗;means (5) then print after 5th index         // From startIndex to end
       // String sub = originalString.substring(startIndex, endIndex); (means start to end ) // From startIndex to endIndex (excluding endIndex)

       String email = "ayushpathak7458@gmail.com";
       String username = email.substring(0,11);
       System.out.println(username);
       String domain = email.substring(16);
       System.out.println(domain);

      //    by indexOf method

      String username2 = email.substring(0,email.indexOf("@"));
      System.out.println(username2);
      String domain2 = email.substring(email.indexOf("@")+1);
      System.out.println(domain2);



      /// from user

Scanner sc = new Scanner(System.in);

String email1;
String username3;
String domain1;

System.out.println("Enter your email");
email = sc.nextLine();

// we can use if condition if we want that for @
if (email.contains("@")) {
    username3 = email.substring(0,email.indexOf("@"));
System.out.println(username3);

domain1 = email.substring(email.indexOf("@") + 1);
System.out.println(domain1);
}else{
    System.out.println("your email is not valid because there is not @ simble");
}


// NOW

// username3 = email.substring(0,email.indexOf("@"));
// System.out.println(username3);

// domain1 = email.substring(email.indexOf("@") + 1);
// System.out.println(domain1);

sc.close();
    }

}

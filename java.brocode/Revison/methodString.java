public class methodString {
    public static void main(String[] args) {
        

        //❤️‍🔥find string length ------ pure String ka length
         String name = " ayush pathak";
         // find lenghth of charecter with space ( count size of String)
         int length = name.length();
         System.out.println(length);


         //❤️‍🔥find letter of string by index; ----- means 6 index pe kya hai
         String name1 = "Ayush pathak";
         char letter = name1.charAt(6);
         System.out.println(letter);

         for(int i=0; i<name1.length();i++){
            System.out.println(i+"."+name1.charAt(i));
         }
         //.charAt(int index) is a method of the String class that returns
         // the character located at a specific position (index) in a string.

        // ❤️‍🔥find index of letter ; ------- a ka index
         String name2 = "Ayush pathak";
         int index = name2.indexOf("a");
         System.out.println(index);

         //❤️‍🔥last Index -- a sabse last me kha pe hai 
         String name3 = " Ayush pathak";
         int lastIndex = name3.lastIndexOf("a");
         System.out.println(lastIndex);

         //❤️‍🔥 uppercase
         String name4 = "ayush pathak";
         name4 = name4.toUpperCase();
         System.out.println(name4);

         //❤️‍🔥 lowwer case
         String name5 = " AYUSH PATHAK";
         name5 = name5.toLowerCase();
         System.out.println(name);

         //❤️‍🔥trim method -- trim space
         String name6 = "     Ayush pathak";
         name6 = name6.trim();
         System.out.println(name6);


         //❤️‍🔥 replace character of string with other
         String name7 = "Ayush pathak";
         name7 = name7.replace("k","l");
         System.out.println(name7);

         //❤️‍🔥 detect is String empty
        //   isEmpty()-------> boolean value 
        System.out.println(name7.isEmpty());
        if (name.isEmpty()){
            System.out.println("your name is Empty");
        }
        else{
            System.out.println("HELLO "+name);
        }


        //❤️‍🔥contains space
        if (name.contains(" ")) {
            System.out.println(" your name contains a space");
            
        }
        else{
            System.out.println(" Your name does not contain any spaces");
        }



        //❤️‍🔥check two Strings are equle --- to do'nt name=password;

        String name9 = "password";
        if (name9.equals("password")) {

            System.out.println("your name can't be password");

        }
        else{
            System.out.println("HELLO "+name9);

        }


        //❤️‍🔥to ignore Case sensitivity(p------>P)
        String name10 = "Password";
        if (name10.equalsIgnoreCase("password")){
            System.out.println("your name can't be password");
        }
        else{
            System.out.println("HELLO "+name10);
        }
 

        // compare
        String nameA = "Tony";
        String nameB = "Tony";

        //1.  String1 > String2 : +ve value
        //2.  String1 == String2 : 0
        //3.  String1 < String2 : -ve value

        if(nameA.equals(nameB)){// nameA == nameB some times fails
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }
        // B is big A is small


        //????????????????????????????????

        // new String declare and comparison

        if(new String("Tony")==new String("Tony")){
            System.out.println("String are equal");
        }                                              //-----> wrong because we need String builder
        else{
            System.out.println("Strings are not equal");
        }

        ////////////////////////////////////
        /// sub string
        /// .substring(start,end)
        /// .substring(indexOf(@))----> start
        
          String email = "ayushpathak7458@gmail.com";
       String username = email.substring(0,11);
       System.out.println(username);
       String domain = email.substring(16);
       System.out.println(domain);

      //    by indexOf method
      // strings are immutable❤️‍🔥❤️‍🔥❤️‍🔥 ---> ek baar ager aapne java ke ander koi string bna di fir na to aap us string ke ander kuch delete ker sakte hai na kuch update ker sakte hai
      // delete aur update ke liye hum new String bnate hai 

      String username2 = email.substring(0,email.indexOf("@"));
      System.out.println(username2);
      String domain2 = email.substring(email.indexOf("@")+1);
      System.out.println(domain2);

      // reverse string 🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥❤️‍🔥

      String nm = "Akshay";
String reverse = new StringBuilder(nm).reverse().toString();
System.out.println(reverse);


    }

    
}

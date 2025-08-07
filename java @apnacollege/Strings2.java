public class Strings2 {
    public static void main(String[] args) {
        

        // IMMUTABLE (JAVA)🎯

      // strings are immutable❤️‍🔥❤️‍🔥❤️‍🔥 ---> ek baar ager aapne java ke ander koi string bna di fir na to aap us string ke ander kuch delete ker sakte hai na kuch update ker sakte hai
      // delete aur update ke liye hum new String bnate hai 
      String str = "h";
      // str stored in stack💢  and pointing to "h" in heap memory💢
    //   🔜str + "e" => "he"     ------> now str pointing to "he"
    //   str + "l" => "hel"       ------> now pointing to "hel"
    //   str + "l" => "hell"       ------> now pointing to "hell"
    //   str + "o" => "hello"🔚    -------> now pointing to "hello"
    // THIS TOO TIME CONSUMING 
    // so they induced us StringBuilder

    // STRING BUILDER🎯

    //                  SYNTAX               //
    // StringBuilder string(name) = new StringBuilder("name")

    StringBuilder sb = new StringBuilder("Tony");
    System.out.println(sb);

    // c=har at index 0🎯
    System.out.println(sb.charAt(0));


    // set char at index 0🎯
    sb.setCharAt(0, 'P');
    System.out.println(sb.charAt(0));


    // insert in string🎯
    sb.insert(0,'S');//------> inserting then S comes first (Tony--> inserting 'S' index 0 ---> STony)
    // if we wanna print Tonny then we have to insert n at index 2;


    // deleting in string (.delete)🎯
    sb.delete(2,3);// ---> take only 2 not 3
    System.out.println(sb);

    sb.delete(2,4);
    System.out.println(sb);

    // append --> addd last me 🎯
    // for hello 
    sb.append("e");
    sb.append("l");
    sb.append("llo");
    System.out.println(sb);


    // String reverse
    // "HELLO" ----> "OLLEH"
    // "TONY" ----> "YNOT"

    // imagine string as arary
    // only for half string 😧

    // code in class ReverseString




     StringBuilder name1= new StringBuilder("Ayush pathak");
     name1.replace(0,name1.length(),"Piyush pathak"); // replace string value with other (aplicable when string is StringBuilder)
          System.out.println(name1);  

    









    }
    
}

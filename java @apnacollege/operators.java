public class operators {
    public static void main(String[] args) {

        // binary operators --> jo do operands ke bich me operation perform kerate hai
        // Unary operators --> increament,decreament
         
       /*  Arithmatic operaters->
        Binary                                Unary(because yha pe ek hi operand hai jinke bich me operation perform ho rha hai)
        +                                      ++
        -                                      --
        *                                      
        /
        %




        Preincrement                                                                Postincrement
        ++a(pehle value ko change keriye fir assine ke dijie)                           a++(pehle value ko use keriye fir change)

        */
        //Postincrement   
        // int a = 10;
        // int b = 0;
        // b=a++;    (pehle b update hoga)                        //pehle value ko use keriye fir change(means pehle a ki value use ho jayegi fir badhegi)
        // System.out.println(b);//10
        // System.out.println(a);//11



        //Preincrement
        int a=10,b=0;
        b=++a;// pehle a=11 update ho jaega fir b ki value aayegi
        System.out.println(b);
        System.out.println(a);


        //🎯 note - Relational operater ki jo value hoti hai vo hoti hai boolean(true/false)

        //note - logical operater check kerte hai ki logic sahi hai ya nhi
        // &&- combine kerna (both condition must be true)
        // ||- 

           /*             BITWISE OPERATOR                 //

                   
           1.bitwise operater🎯🎯(decrease space requairement and memory consumsion)
           2.&,|,^,~,<<,>>(binary And not Logical and🎯😧)
           3.dynamic programming used

         ____________________________________________

         1.& (binary and)❤️‍🔥

        0101 & 0110 (1--> true)(0 --> false)
        0101
        0110
        -----
        0100  ( if both condition is true then run)

        ____________________________________________


        2. | (binary OR)❤️‍🔥
        0101
        0110
        -----
        0111(any one is true then true)
        ____________________________________________

        3.^(XOR)❤️‍🔥

        similar(1 1)(0 0) value then false
        diffreent(1 0)(0 1) values then true

        0101
        0110
        -----
        0011
        ____________________________________________

        4.~(one's complement )❤️‍🔥
        1-->0
        0-->1
        0101(one's complement)----> 1010
        0110(~)----> 1001

        _____________________________________________

        5.<<(binary left shift)❤️‍🔥

        A = 0101
        A<<1
        0101<<1 ===> 1010

        B=0110
        B<<1
        0110<<1  ===> 1100

        _____________________________________________

        6.>>(binary right shift)❤️‍🔥
        
        A=0101
        A>>1 
        0101>>1 ==> 0010

        B=0110
        B>>1 
        0110>>1==> 0011

        

       




        







        
        
    }



    
}

public class Bitmanupulation {
    public static void main(String[] args) {

        /*    
        
                 BIT MANUPULATION

         1.GET         (janna hai ki use position pe kaon si bit hai 0,1)
         2.SET         (us bit ko 1(chahe 1 ho) set ker denna hai)
         3.CLEAR       (use bit ko 0 kerdena hai)
         4.UPDATE      (0->1,1->0)
    ___________________________________
    1.GET BIT🎀            

    Q.Get the 3rd bit (position =2)of a number n.(n=0101)

    0101
    ||||
    3210(2bit-> position = 1)


    Bit Mask: '''''''''1<<i'''''''''
    Operatiom :Bitwise '''''''AND'''''''&


    1. Step
        Bit mask (ek hi jagah pe one hoga)
           
            1<<position
            1<<2 ===> 0001<<2
            output
            0100
   
    2.Step
       Bitwise Operation: AND  
        
             0100 AND 0101 ---> 0100



     Q.Get the 3rd bit (position =3)of a number n.(n=0101)       
     
     step1-->
       bit mask 
            1<<3---> 0001<< ===> 1000


    step2--->
       operation  AND
           1000
           0101
           -----
           0000 
           ------
    position(3) Bit="0"           
            
______________________________________

int n =5;
int pos =2;
int bitMask=1<<pos;
int newNumber = bitMask & n;

if(newNumber==0){
    System.out.println("bit was zero");
}
else{
    System.out.println("bit was 1");
}

-----------------------------------------
*/

/*         2.SET BIT🎀 

2.Set the 2nd bit(position 1 ) of a number n.(n=0101)--SET--(0111)

Step 1: Bit Mask(1<<i)
Step 2: Operation(OR)

  Step 1 :        1<<i
                  1<<1
               0001<<1 --> 0010    

  Step 2:        Operation OR
                 0010 || 0101
                 0111

*/

// int n =5;
// int pos =1;
// int bitMask=1<<pos;

// int newNumber = bitMask | n;

// System.out.println(newNumber);

/* 

                    3.CLEAR BIT🎀

Step 1: Bit Mask(1<<i)
Step 2: ~(Bit Mask)
Step 3: Operation (AND)

Q.Clear the 3rd bit(position 2) of a anumber n. n(0101)

STEP 1. 
   bitMask = 1<<2
            0001<<2
           


STEP 2. 

     ~(0100) ---> NOT --> 1011
    

STEP 3.
       Operation(AND with "bitMask NOT")
                             1011
                             0101
                             -----
                             0001

*/
// int n =5;
// int pos = 2;
// int bitMask = 1<<pos;
// int notBitMask = ~(bitMask);

// int newNumber = notBitMask & n;
// System.out.println(newNumber);

/* 
              4.UPDATE BIT🎀

 FOR 0. (clear BIT🎀)  1-->0                                     
 
 .                                                                     FOR 1:(Set 🎀)
  1.  BitMask : 1<<i              /
  2.  ~(Bit mask)                                                    1. BitMask : 1<<i
  3.  Operation : AND with ~(Bit mask)                               2. Operation : OR

     
    */
 // Q. Update the 2nd bit (position 1) of a number  n to 1.n(0101)
 
         
         







             





        
    
         
        
    }
    
}

import java.util.Scanner;
public class forloop {
    public static void main(String[] args) throws InterruptedException {
        // for loop = execute some code a certain amount of time (if u wanr to repeate a code certain amount of time)
   // for(initialization ; condition ; updation){
        // }

        // i = counter

        // for (int i = 10 ;i>0 ; i-=2){
        //     System.out.println(i);
        // }
        // i++ = incrementing by one 
        // i+=2 = incrementing by 2

        Scanner sc=new Scanner(System.in);
        System.out.println("ENter how many times you want to loop :");
        int MAX = sc.nextInt();

        // happy new year 
        for(int i=MAX; i>0 ;i--){
            System.out.println(i);
            Thread.sleep(1000);//throws InterruptedException
        // slow output by 1 sec;
            //Thread is a class in java.lang package.
            //sleep(long millis) is a static method of Thread class that pauses the currently executing thread.
           // 1000 is the duration to sleep in milliseconds.
           //Tumhara program 1 second ke liye ruk jaata hai.
        }
        System.out.println("HAPPY NEW YEAR ");



      


     
    }
    
}

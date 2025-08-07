public class recursion1 {
    // recursion function me hota hai
    /*
    ________________________________________________________

               SYNTAX
    
    returnType functionName(parameters) {
    if (baseCondition) {
        // stop condition
        return result;
    } else {
        // recursive call
        return functionName(smallerProblem);
    }
}


⭐ Har recursion ke do part hote hain:
1️⃣ Base case → jahan function rukta hai
2️⃣ Recursive call → jahan function khud ko call karta hai
 ____________________________________________________________   
*/

    //___________________________________________

    // public static void printNumber(int n) {
    //     if(n==6){
    //         return;//Base case (reach)
    //     }
    //     System.out.println(n);
    //     printNumber(n+1);
    // }
    //_____________________________________________

    // Q. print sum of first n natural number.naturanumbe 1,2,3,4,5,6,7,8,9,10.....n           -> n(n+1)/2
    
        // public static void printSum(int i, int n,int sum){

        //     if(i==n){
        //         sum=sum+i;
        //         System.out.println(sum);
        //     }else{
        //         sum=sum+i;
        //     printSum(i+1, n, sum);

        //     }

        // }
        // public static int factorial(int n){
        //     if(n==0 || n==1){                        // Base case
        //         return 1;
        //     }else{
        //          return n*factorial(n-1);  //  Work
        //     }
         
        // }
        // public static int  factorial(int n){
        //     if(n==0 | n==1){
        //       return 1;
        //     }
        //     else{
        //          int fact_1=factorial(n-1);
        //  int  total_fact = n*fact_1;
        //  return total_fact;
        //     }
        
        // }
        /*  fabonacci sequence --  a b c
        c=a+b
        */
        public static int  fabonacci(int n){
            if(n==0){
                return 0 ;
            }
            System.out.println(fabonacci(n));
           return  fabonacci(n-1)*fabonacci(n-2);


            

        }


           
            

        

        

    public static void main(String[] args) {
        //   prerequisites
        //  -->  loops/iteration
        //  -->  functions 
        // recursion -> a function that calls itself.

        // int n = 1;
        // printNumber(n);// function call

       

        // printSum(1,10,0);
        // int ans =factorial(4);
        // System.out.println(ans);

        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        System.out.println(fabonacci(5));// n-2 --> a,b are printed



 
}
}
    


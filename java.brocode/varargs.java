public class varargs {
    public static void main(String[] args) {
          // varargs = allow a method to accept a varying # of arguments
        //                  makes methods more flexible, no need for overloaded methods
        //                  java will pack the arguments into an array
        //                  ... (ellipsis)
        //           we can minimize overloaded method
        System.out.println(average());
        System.out.println(add(1,2,34,5,6,6,6));
    }

    static int add (int... numbers){// numbers is array by java compiler
        //varargs parameter (Java makes an int[] array named numbers).
       
        int sum = 0;
        for(int number : numbers){
            sum=sum+number;
        }
        return sum;
    }

    static double average(double... numbers ){
        double sum=0;
        if (numbers.length==0){
            return 0;
        }
        for (double number : numbers){
            sum+=number;
        }
        return sum/numbers.length;

    }


}

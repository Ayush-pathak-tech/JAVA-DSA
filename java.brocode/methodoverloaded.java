public class methodoverloaded {
      // overloaded methods = methods that share the same name,
        //                                          but different parameters
        //                                          signature = name + parameters
        // overloaded = same "name" diff "parameter";

        // each method signature needs to be unique no two methods can share same signature but they can share same name 

        public static void main(String[] args) {
            
            

            /// calling method in main method
            System.out.println("sum of these two numbers "+add(2,3));
            System.out.println(add(1,2,3,4,4));

            System.out.println(bakePizza("flat "));
                        System.out.println(bakePizza("flat ","mozrella"));
                                    System.out.println(bakePizza("flat pizza","mozrella","pepperoni"));





            
        }
        //methods(same name but diff parameter)
        static double add(double a,double b) { return a+b;};
        static double add(double a, double b , double c){return a+b+c;}
        static double add(double a, double b , double c,double d){return a+b+c+d;}
        static double add(double a, double b , double c,double d,double e){return a+b+c+d+e;}
        static double add(double a, double b , double c,double d , double e ,  double f){ return a+b+c+d+e+f;}
        static double add(double a, double b , double c,double d , double e ,  double f, double g, double h , double i,double j,double k){ return a+b+c+d+e+f+g+h+i+j+k;}

        static String bakePizza(String bread){return bread+" pizza" ;}
        static String bakePizza(String bread,String cheese){return cheese +" "+bread+" pizza"; }
        static String bakePizza(String bread,String cheese,String topping  ){return topping+" "+cheese +" "+bread+" pizza"; }


        















}

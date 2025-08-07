public class methodparameter {
    public static void main(String[] args) {
        

        HappyBirthday("Rahul",34);               //(1)

        int add=sum(24,34);  
                           //(2)
        System.out.println(add);

        System.out.println(areaOfCircle(64.3));

       System.out.println(square(3));

       System.out.println(getFullname("Ayush" ,"pathak"));

       int age = 21;
       if(agecheck(age)){
        System.out.println("You may sign up!");
       }
       else{
        System.out.println("You may not sign in!");
       }
    }/////////////////////////////////////////////////////////////
    // matching set off argument in method and calling
    static void HappyBirthday(String name,int age){//(1)
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n",age);
        System.out.println("Happy Birthday to you!\n");
    }
    static int sum(int a , int b){               // (2)
        return a+b;
    }
    static double areaOfCircle(double radius){  //(3)
        return 3.14*radius*radius;

    }
    

    static double square(double number){
        return number *  number;
    }
    static String getFullname(String first , String last){
        return first+" "+last;
    }
    static boolean agecheck(int age ){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }

    }






}

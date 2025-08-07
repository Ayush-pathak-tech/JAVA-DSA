public class Arraysearch {
    public static void main(String[] args) {

        int[] numbers = {1,9,2,8,3,5,4};
        String[] fruits = {"apple","banana","orange"};
       String target = "orange";
        boolean isFound = false;

        for(int i = 0; i<numbers.length ; i++){
            if(fruits[i].equals(target)){
                // for String use equals method of string
                System.out.println("Elemnt found at index:"+i);
                isFound = true;
                
                break;

            }
        }
        if(!isFound){
            System.out.println("Element not in array");

        }
        

    }
    
}

// public class Array2D2 {
//     public static void main(String[] args) {
//         String[] fruits= {"apple","orange","banana"};
//         String[] vegetables = {"potato","onion","carrot"};
//         String[] meats={"chicken","pork","fish"};

//         String[][] groceries ={fruits,vegetables,meats};

//         for(String[] foods: groceries){
//             for(String food : foods){
//                 System.out.print(food+" ");

//             }
//             System.out.println();
//         }
        
//     }
// }
    
// **********************************************************************
public  class Array2D2{
    public static void main(String[] args) {
        char[] row1 = {'1','2','3'};
        char[] row2 = {'4','5','6'};
        char[] row3 = {'*','0','#'};

        char[][] telephone = {row1,row2,row3};

        for(char[] Row : telephone){
            for(char num : Row){
                System.out.print(num+" ");

            }
            System.out.println();
        }

        }
        
        
    }


    


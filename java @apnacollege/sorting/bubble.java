public class bubble {
    // pani ke ander jo bubbles hote hai vo dheere dheere uper a ajate hai
    // ascending order (12345)

    //           78312          123456789 10 
           
   public static void main(String[] args) {
     int arr[] = {7,8,3,1,2};

     // time complexity = 0(n^2)
    //bubble sort
    for(int i=0; i<arr.length-1;i++){ //bahar se batana hai ki is number ko swap kero (n-1 bade bubble ko place kerta hai// n-1(kitne eliment ka comparision kerana hai)  btata hai ki mujhe kitne numbers ke pass jana hai(ek ke pass nhi jana hota kyuki vo apne app sort ho jata hai) 
        for(int j=0; j<arr.length-1-i;j++){// addjsent element ko compair aur swap ker ske //usi number ko swap kerne lag jayega// run for comparison(jo vo ek hai use kitni baar dusre se comparision kerana hai)
           // arr.length-1-i --> (run for largest unsorted element) her baar haume last element tak loop chalane ki jarurat nhi padti use  chhod dete hai
            if(arr[j]>arr[j+1]){
                //swap
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
   printArray(arr);
   }

    private static void printArray(int[] arr) {
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    
}
/*  int arr[] = new int[];

for(int i=0; i<arr.length-1;i++){
for(int j=0; j<arr.length-1-i; j++){
// swap
  if(arr[j]>arr[j+1]){

  int temp =arr{j};
  int arr[j]=arr[j+1];
  arr[j+1]=temp;
  
  }

}
}

printArray(arr);
*/ 



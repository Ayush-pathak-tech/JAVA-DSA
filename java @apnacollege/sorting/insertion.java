public class insertion { 
    // we are assuming that
    // "7 | 8312"
    // 7 is sorted part and 8312 is unsorted part
    //  78 | 312
    //Comparison btw 3 and sorted part
    // _ _ _78 | 312
    // 3 is less than 8,7
    // _ _ _ 78 | 312
    // _ _ 378|12
    // _1378 | 2
    // 1_378 | 2
    //12378 sorted
    public static void main(String[] args) {

       
    
        int arr[] = {7, 8, 3, 1, 2};

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            // Shift larger elements to the right
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert current element at the correct position
            arr[j + 1] = current;
        }

        // Print sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}



        
   
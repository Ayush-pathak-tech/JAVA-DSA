public class selection {
    public static void main(String[] args) {
        int arr[] ={7,8,3,1,2};

        // time complexity = O(n^2)
        // selection 
        //78312
        for(int i=0; i<arr.length-1; i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){//compair pehle aur agle se
                if(arr[smallest]>arr[j]){
                    smallest =j;
                }


            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }

        
    }
    
}

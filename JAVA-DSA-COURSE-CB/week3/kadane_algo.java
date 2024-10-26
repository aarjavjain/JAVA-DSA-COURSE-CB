package week3;

public class kadane_algo { 
   // time complexity
//         public void rotate(int[] nums, int k){
//            k%=nums.length;
//             for ( int i=0;i<k;i++)
//             rotatenums(nums);
        
//         }
//        public void rotatenums(int[] nums) {
//            int temp = nums [nums.length-1];
//            for (int i=nums.length-1;i>0;i--){
//            nums[1] = nums[i-1];
//            nums[0] = temp;
//        }
//        }
//    

public void rotate(int[] nums, int k) {
    int n= nums.length;
    int arr[] = new int[n];
    for(int i=0 ;i<n;i++){
        int temp = i+k;
        while(temp>=n){
            temp = temp - n;
        }
        arr[temp]= nums[i];
    }
    //deep copy
    for (int i = 0; i < n; i++) {
    nums[i] = arr[i];
}     
}
}
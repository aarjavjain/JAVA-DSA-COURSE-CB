package week3;

public class rotatearray {
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

// public void rotate(int[] nums, int k) {
//     int n= nums.length;
//     int arr[] = new int[n];
//     for(int i=0 ;i<n;i++){
//         int temp = i+k;
//         while(temp>=n){
//             temp = temp - n;
//         }
//         arr[temp]= nums[i];
//     }
//     //deep copy
//     for (int i = 0; i < n; i++) {
//     nums[i] = arr[i];
// }     
// }
// }


//more optimise solution
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k,n-1);

    }

    public  void reverse(int[] nums, int start, int end){
   
   while (start < end){
    
    int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
   }
}} 


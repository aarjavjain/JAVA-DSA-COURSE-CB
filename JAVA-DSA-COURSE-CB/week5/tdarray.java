package week5;
import java.util.*;
public class tdarray {
// sorting in 2d  Aarray
static void sortByRows(int[][]nums){
    for (int i=0;i<nums.length;i++){
       Arrays.sort(nums[i]);
    }
}
static void sortByColumns(int[][]nums){
    for (int i=0;i<nums.length;i++){
        Arrays.sort(nums,(a,b)->Integer.compare(a[0],b[0]));
    }
}

    //transpose 
//     static void transpose(int[][] nums){
//         for(int i=0;i<nums.length;i++){
//            for(int j=i;j<nums[0].length;j++){
//         int[] temp = nums[i][j];
//         nums[i][j] = nums[j][i];
//         nums[j][i] = temp;
//            }
//     }
// }
    //to linear search
//     static void search(int[][] nums){
//         int[] ans =new int[2];
//         for(int i=0;i<nums.length;i++){
//         for(int j=0;j<nums[0].length;j++){
//         if (nums[i][j]==n) {
//             ans[0]=i;
//             ans[1]=j;
//             return ans;
//  }
// }
//     }
//         return ans;
//     }
    
    //to sum the 2darray
    // static void sum(int[][] nums )
    // int sum=0;

    // for (i:sum){
    //     for (i+nums){
    //         return(nums);
    //     }
    // }
    // to display the array
    static void display(int[][]nums){
        for(int[] i:nums){
        for(int j:i){
            System.out.println(j +"\t");
        }
        System.out.println();
    } 
}
    static void populate(int[][]nums){
        int n=1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                nums[i][j]=n;
                n++;
            }
        }
    }
    
    
    //2d array 
   public static void main (String[] args){
    int[][]nums = new int[4][4];
    populate(nums);
    // transpose(nums);
    sortByRows(nums);
    sortByColumns(nums);
    display(nums);
   }
}



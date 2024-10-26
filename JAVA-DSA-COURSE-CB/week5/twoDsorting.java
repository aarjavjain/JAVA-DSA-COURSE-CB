package week5;
import java.util.*;
public class twoDsorting {
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
    static void display(int[][]nums){
        for(int[] i:nums){
        for(int j:i){
            System.out.print(j +"\t");
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
    
   public static void main(String[] args){
    int[][]nums = new int[4][4];
    populate(nums);
    sortByRows(nums);
    sortByColumns(nums);
    display(nums);
   }
}

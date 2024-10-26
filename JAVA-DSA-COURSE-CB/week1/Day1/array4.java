package week1.Day1;

public class array4 {
    // create a swap function to swap 2 values inside an array
    static void swap(int[] arr){
        int a =0;
        int b=0;

        for (int i=0;i<arr.length/2;i++){
            a=arr[i];
            b=arr[arr.length-i-1];  
            arr[i] = b;
            arr[arr.length-i-1] = a;
        }
    }
    // static void reverseusingswap(int[] arr, int i , int j){
    //     for(int i-0 , j-arr.length -1; i<j;j--,i++){
    //         swap(arr,i,j);
            
    //     }        
    // }
    public static void main(String[] args) {
        int [] num = new int [7]; 
        for (int i=0;i<num.length;i++){
            num[i] = i+1;

        }
        swap(num);
        for(int i:num){
        System.out.print( i + " ");
    }
}
}

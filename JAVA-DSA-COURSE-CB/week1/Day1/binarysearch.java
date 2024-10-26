package week1.Day1;

public class binarysearch {
 static int binary(int[] arr, int n){
    int low=0,high=arr.length-1;
    int mid = 0 ;
    while (low<=high) {
         mid =(low+high)/2;
          if (arr[mid]==n) 
          return mid;
          else if(arr[mid]<n){ 
          low=mid+1;
          }
          else
        high=mid-1;
    }
    return -1;


 }

    public static void main(String[] args) {
        int n= 3;
        int[] arr ={1,2,3,4,5} ;
        System.out.println(binary(arr, n));
        System.out.println();
        System.out.println();
    }
}

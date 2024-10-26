package week2;

public class upperbound {
    static int upper(int[] arr,int num){
        int firstoccurence = -1;
        int low = 0,high= arr.length-1 , mid =1; 
        while(low<=high){
            mid=(low+high)/2;
            if (arr[mid]==num){
                firstoccurence=mid+1;
                low=mid+1;

            }else if (arr[mid]<num){
                low=mid+1;
            }else 
                high=mid-1;
        }
        return firstoccurence;

    }
    public static void main(String[] args) {
        
        int[] arr = {1,3,3,3,3,3,6,7,8,9};
        System.out.println(upper(arr, 0));
    }
    
}



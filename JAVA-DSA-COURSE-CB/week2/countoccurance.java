package week2;
public class countoccurance {
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

    
        static int lower(int[] arr,int num){
            int firstoccurence = -1;
            int low = 0,high= arr.length-1 , mid =1; 
            while(low<=high){
                mid=(low+high)/2;
                if (arr[mid]==num){
                    firstoccurence=mid;
                    high=mid-1;
    
                }else if (arr[mid]>num){
                    high=mid-1;
                }else 
                low=mid+1;
            }
            return firstoccurence;
    
        }

    static int occurance (int[] arr,int num){
        int lb= lower(arr, num);
        if(lb==-1) return 0;
        int ub = upper(arr, num);
       return ub-lb;
        

        
    }


    


    public static void main(String[] args) {
        int num = 3;
        int[] arr = {1,2,3,4,4,4,5,6,7,8,};
        System.out.println(occurance(arr, num));
    }
}
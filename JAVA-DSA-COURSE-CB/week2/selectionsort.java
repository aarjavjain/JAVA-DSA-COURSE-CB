package week2;

public class selectionsort {
    static void selection(int[] arr){
        for(int i=0; i<arr.length-1;i++){
            int idx  = minimumValue(arr, 1);
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }

    static int minimumValue(int[] arr, int a){
        int mini = a;
        for (int i = a +1;i<arr.length; i++){
            if (arr[mini]>arr[i])
            mini =i ;
            return mini;
        }
    }
        
    }


package week3;

public class trappedwater {
    public int trap(int[] height) {
       
        int[] nger = nger(height);
        int[] ngel = ngel(height);
        int storedWater =0;

        
    
     public static int[] nger(int[] arr){
        int minElement = 0;
        int[] nger= new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            nger[i] = minElement;
            minElement=Math.max(arr[i],minElement);

        }
        return nger;
    }

    public static int [] ngel(int[] arr){
        int minElement =0;
        int [] ngel = new int [arr.length];
        for (int i = 0; i<arr.length;i++){
            ngel[i]= minElement;
            minElement = Math.max(arr[i],minElement);
        }
        return ngel;
    }
    public static void main(String[] args) {
        for (int i = 0 ;i<n;i++){
            int minHeight = Math.min (ngel[i], nger[i]);
            storedWater +=minHeight - height[i];
        }
        return storedWater;

    }
}
}

package week1.Day1;

public class array2 {
    //return the sum of your array:1,2,3,4,5
    static int sumArr(int[] arr) {
        int sum=0;
        for (int i=0;i<arr.length;i++)
        sum+= arr[i];
        return sum; 
    }
    public static void main(String[] args) {
        int [] num = new int [5]; 
        for (int i=0 ;i<num.length;i++){
            num[i]= i+1;
        }
        System.out.println("the sum of the number in array is:" + sumArr(num));
    }
}
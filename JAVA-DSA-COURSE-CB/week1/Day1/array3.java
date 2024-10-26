package week1.Day1;

public class array3 {
    // reverse the array
    static void reverse(int[] arr){
      int[] temp = new int[arr.length];
      for (int i =0;i<arr.length;i++){
      temp[i]=arr[arr.length-1-i];
      arr[i]= temp[i];
    }
  }

    
    public static void main(String[] args) {
     int[] arr={1,2,3,4,5};
     reverse(arr);
     System.out.println();   
    }
  }

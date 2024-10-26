package week1.Day1;
public class linearsearch{

 static boolean linearsearch1(int[] arr,int n){
    for (int i: arr)
        if (i==n) return true;
        return false;
 }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5} ;
        System.out.println(linearsearch1(arr, 8));
        System.out.println();
        System.out.println();
    }
}

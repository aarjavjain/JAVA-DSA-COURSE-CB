package week7;

public class fibonacciques {
    public static int fibonacci(int x){
     if (x==1 || x==0){
        return x;
     }
     else{
        return fibonacci(x-1) +
        fibonacci(x-2);
     }   
     
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}

package week6;

public class power {
     int pwr(int a,int b){
        if (b==0)
        return 1;
       int x = a*pwr(a,b-1);
       return x;
     }
     public static void main(String[] args) {
        System.out.print(power(2,3));
     }
}

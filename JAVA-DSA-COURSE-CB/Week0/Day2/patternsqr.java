package Week0.Day2;

import java.util.Scanner;

class PatterPrinting{
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       int n;
       System.out.print("enter the number of lines:");
       n=sc.nextInt();
       for (int i= 0;i<n; i++){
        for(int j=1;j<=n;j++){
            System.out.print("*");
            sc.close();
       }
       System.out.println();
    }
  }
}
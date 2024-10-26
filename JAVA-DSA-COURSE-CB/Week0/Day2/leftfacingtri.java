package Week0.Day2;

import java.util.Scanner;

public class leftfacingtri {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
       int n;
       System.out.print("enter the number of rows:");
       n=sc.nextInt();
       for (int i=1;i<=n; i++){
        for(int k=1;k<=n-i;k++){
            System.out.print("*");
        }
        for(int j=1;j<=i;j++){
            System.out.print(" ");
            
            sc.close();
            }
       
       System.out.println();
    }
    }

}

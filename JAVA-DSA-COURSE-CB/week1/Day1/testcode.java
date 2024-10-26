package week1.Day1;  
import java.util.Scanner;  

public class testcode {  
    
    static int reverseTheNumber(int temp) {  
        int ans = 0;  
        while (temp > 0) {  
            int rem = temp % 10;  
            ans = ans * 10 + rem;  
            temp = temp / 10;  
        }  
        return ans;  
    }    
     static long convert0To5(long num) {  
        if (num == 0) {  
            return 5;  
        }  

        long temp = 0;  
        long placeValue = 1;  
        while (num > 0) {  
            int digit = (int)(num % 10);  
            if (digit == 0) {  
                digit = 5;  
            }  
            temp = digit * placeValue + temp;   
            placeValue *= 10;    
            num = num / 10;     
        }  

        return temp;  
    }  
    
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("");  
        long n = sc.nextLong(); 
        if (n < 0 || n > 100000000000L) {  
            System.out.println("Error"); 
            } 
        else {   
        long converted = convert0To5(n);  
        System.out.println("Converted Number: " + converted);  
        sc.close();   
    }   
}}
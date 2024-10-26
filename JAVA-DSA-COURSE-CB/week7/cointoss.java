package week7;  

public class cointoss {  
    static void coin(int H, String T) {  
        if (H == 0) {  
            System.out.println(T);  
            return;  
        }  
        
        coin(H - 1, T + "H"); // Recursive call with "H" appended  
        coin(H - 1, T + "T"); // Recursive call with "T" appended  
    }  

    public static void main(String[] args) {  
        coin(3, ""); // Pass integer 3 instead of string  
    }  
}
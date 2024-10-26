package week9;
public class keypad{
     static String[] arr = {" ", " ", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
     static void key (String[] arr,String q ,String a ){
        if (q.length()==0){
            System.out.println(a);
            return; 
           }
     char  ch = q.charAt(0);
     String press= arr[ch-'0'];   
     for (int i =0;i<press.length();i++){
     key(arr ,q.substring(1),a + press.charAt(i));   
     }
     }
     public static void main(String[] args) {
        String q ="24589";
        String a ="";
        key(arr, q, a);
        
     }
}
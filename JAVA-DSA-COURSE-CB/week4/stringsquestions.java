package week4;
import java.util.Locale;
public class stringsquestions {
    //q1 funciton to reverse a string
    public static String reverseString (String input){
         char[]  charArray= input.toCharArray();
         int start=0;
         int end=charArray.length-1;
         while (start<end ){
            char temp = charArray[start];
            charArray[start]= charArray[end];
            charArray[end]=temp;
            start++;
            end--;
         }
         return 0;
        }
    public static void main(String[] args) {
        String s1 = "potato";
        String s2 = reverseString(s1);
        System.out.println();
    }
}

package week7;

public class recursion_countsubsequence {
    static int countSubSequences(String ques){
        if (ques.length()==0){
            return 1;
        }
        int l=countSubSequences(ques.substring(1));
        int r=countSubSequences(ques.substring(1));
        return  l+r;
    }
    public static void main(String[] args) {
        System.out.print(countSubSequences("CAR"));
    }
}

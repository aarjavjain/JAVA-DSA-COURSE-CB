package week7;

public class recursivecall {
    static void perm(String ques,String ans){
        if (ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i;0<i<ques.length;i++){
            int S1=ques.substring(0, i);
            int S2=ques.substring(i+1);
            perm(ques.substring(1), ans + ques.charAt(i) );
            perm(ques.substring(1), ans);
        }
    }
    public static void main(String[] args) {
        perm(3, 3);
    }
}

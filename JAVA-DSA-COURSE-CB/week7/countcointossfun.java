package week7;
public class countcointossfun{
    static void countCointoss(int num,String ans){
        if (num==0){
            System.out.println(ans);
            return ;
        }
        if(num==1)
        return 2; 
        int l=countCointoss(num-1);
        int r=countCointoss(num-1);
        return l+r;
    }
    public static void main(String[] args) {
        countCointoss(3, null);
    }
}
package week7;

public class subsequences {
    static void sub(String P1,String P2){
     if (P1.length()==0){
      System.out.println(P2);
      return; 
     }
    
    else {
        sub(P1.substring(1), P2 + P1.charAt(0) );
        sub(P1.substring(1), P2);
    }
}
    
    public static void main(String[] args) {
        sub("CAR", "");
    }
}

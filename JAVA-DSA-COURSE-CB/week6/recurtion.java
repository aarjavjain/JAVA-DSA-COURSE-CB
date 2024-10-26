package week6;

public class recurtion {
   //using concept of principle of induction in mathematics 

   
    //head recursion 
    // static int fact(n){
    //     if (n==0||n==1)
    //     return 1;
    //     int x = n *fact(n-1);
    //     return x;
    
    // }
    //tail recursion
    static int fact(n){
      if (n==0||n==1)
      return 1;
      int x = n *fact(n+1);
      return x;
  
  }
  
}

package Day0;
 public class helloworld {
   
    static int inversevalue(int n){
      int temp =0;
      while (n !=0 ){
           temp = temp*10 + n%10;
          n/= 10;
      }
      return temp;
  }
}
      



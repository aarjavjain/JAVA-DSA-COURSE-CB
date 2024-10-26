package week3;

public class bsearchsearchspace {
    static boolean check(int speed,int dist,int time){
        int dist_travelled=speed*time;
    return (dist_travelled >=dist);
    }
    static int reachCenter(int dist,int time){
    int low = 0;
    int high= 200;
    int optimal=-1;

    while (low<=high){
       int  mid = high - (high - low)/2;
       if (check(mid,dist,time)){
        optimal=mid;
        high = mid -1;
       }
       else{
        low=high-1;
        
        
       }
       return -1;
    }
      public static void main (string[]args){
        int dist=1000,time=2;
        System.out.println(reachCenter(dist, time));
        
      }
    }
}

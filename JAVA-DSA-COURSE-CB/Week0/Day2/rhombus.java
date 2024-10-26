package Week0.Day2;

public class rhombus {
    public static void main (String[]args){
        int n=5;
        int l=n/2;
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=l;j++){
            System.out.print(" ");
            }
        
            for(int j=1;j<=k;j++){
                
                    System.out.print("*");
                }
                
                    System.out.println("");
                
                if (i <= n / 2) {  
                    l--;  
                    k += 2;  
                } else {  
                    l++;  
                    k -= 2;  
                }
            }  

            }
            

    } 

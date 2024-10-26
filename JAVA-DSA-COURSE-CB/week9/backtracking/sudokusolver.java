package week9.backtracking;

import java.util.Scanner;

public class sudokusolver {
    static  boolean check(int[][] board,int i,int j,int num){
       for (int k=0;k<9;k++){
        if (k!=i && k!=j){
            if (board[i][j]== board [j][k] || board[i][j] == board[i][k])
            return false;
          }
       }
       int n= board.length;
            int root_n= (int)Math.sqrt(n);
            int ri= (i/root_n)*root_n;
            int rj= (j/root_n)*root_n;
            for(int x= ri; x<ri+root_n;x++){
                for(int y= rj; y<rj+root_n;y++){
                    if(x!=i && y!=j){
                        if(board[x][y]==board[i][j])
                            return false;
                    }
                }
            }
        return true;
    }

    
    static boolean sudokuSolver(int[][] mat,int i ,int j,int n ){
        if (i==n) return true;
        if (j==n) sudokuSolver(mat, i+1, 0, n);
        if(mat[i][j]!=0) sudokuSolver(mat, i, j+1, n);

        for(int num=1;num<=9;num++){
            if(check(mat,i,j,num)){
                mat[i][j]=num;
                if(sudokuSolver(mat, i, j+1, n))
                return true;
            }
        }
        //backtracking 
        mat[i][j]=0;
        return false;

    }
   public static void main(String[] args) {
    int n =9;
    Scanner sc = new Scanner (System.in);
    int mat[][]= new int[n][n];

    for (int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            mat[i][j] = sc.nextInt();
        }
    }
   sudokuSolver(mat,0,0,n);
   System.out.println();
   System.out.println();
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(mat[i][j]+" ");
            

        }
        System.out.println();
    }
   } 
 }
// 5 3 0 0 7 0 0 0 0
// 6 0 0 1 9 5 0 0 0
// 0 9 8 0 0 0 0 6 0
// 8 0 0 0 6 0 0 0 3
// 4 0 0 8 0 3 0 0 1
// 7 0 0 0 2 0 0 0 6
// 0 6 0 0 0 0 2 8 0
// 0 0 0 4 1 9 0 0 5
// 0 0 0 0 8 0 0 7 9
  

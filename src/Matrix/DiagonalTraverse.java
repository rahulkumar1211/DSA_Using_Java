package Matrix;
import java.sql.Array;
import java.util.*;
public class DiagonalTraverse {

    public static void main(String[] args) {
            diaPrint();

    }

    /**
     * Simple traversing a matrix in diagonal fashion
     */
    static void diagonalPrint(){
        int[][] M=new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };
        int rowlen=M.length;
        int collen=M[0].length;
        int r=0;
        int c=0;
        while(r<rowlen && c<collen){
            for(int row=r,col=c;row>=0 && col<=r;row--,col++){
                System.out.print(M[row][col]+" ");
            }
            if(r<rowlen-1){
                r++;
            }else{
                c++;
            }
        }
    }

    /**
     * Traversing matrix in diagonal fashion but direction should alter in each iteration
     * https://leetcode.com/problems/diagonal-traverse/
     */
    static void diaPrint(){
        int[][] M=new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };
        int rowlen=M.length;
        int collen=M[0].length;
        int r=0;
        int c=0;
        boolean up=true;
        while(r<rowlen && c<collen){
            if(up==true){
                while(r>0 && c<collen-1) {
                    System.out.print(M[r][c] + " ");
                    r--;
                    c++;
                }
                    System.out.print(M[r][c]+" ");
                    if(c==collen-1){
                        r++;
                    }else{
                        c++;
                    }

            }else{
                while(r<rowlen-1 && c>0) {
                    System.out.print(M[r][c] + " ");
                    r++;
                    c--;
                }
                System.out.print(M[r][c]+" ");
                    if(r==rowlen-1){
                        c++;
                    }else{
                        r++;
                    }
            }
            up=!up;
        }
    }
}

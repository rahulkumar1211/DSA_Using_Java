package Matrix;
import java.util.Arrays;
/**
 * Mark the entire row and column to zero whenever you find zero in the matrix
 */
public class MarkZero {
    public static void main(String[] args) {
          int[][] matrix={
                  {0,1,2,0},
                  {3,4,5,2},
                  {1,3,1,5}
          };
         makeZero(matrix);
    }

    /**
     * Brute Force solution
     * Worst Case time complexity: O(N^3)
     * Space complexity: O(1)
     * @param matrix

    public static void markZero(int[][] matrix){
        for(int i=0;i<matrix.length;i++){         //Time complexity of this: O(N*M).O(N)~= O(N^3)
            for(int j=0;j<matrix[0].length;j++){  //Time complexity for J-loop: O(N).O(N) because below function also take O(n) time complexity
                if(matrix[i][j]==0){
                    markRow(i,matrix);
                    markCol(j,matrix);
                }
            }
        }
        markZeroInMatrix(matrix);
    }

    static void markRow(int i,int[][] matrix){
        //function to make all the element int that particular row to -1
        //here i indicating which row to make -1. so it is constant
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
        }
    }

    static void markCol(int  i,int[][] matrix){
        //function to make all the element int that particular col to -1
        //here i indicating which col to make -1. so it is constant
        for(int j=0;j<matrix.length;j++){
            if(matrix[j][i]!=0){
                matrix[j][i]=-1;
            }
        }
    }

    static void markZeroInMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
        for(int[] arr:matrix){
            for(int num:arr){
                System.out.print(num+" ");
            }
            System.out.println();
        }

    }

    */

    /***
     * Time complexity: O(N*M)
     * Space complexity: O(N)+O(M)- not efficient
     * @param matrix
     */
    public static void makeZero(int[][] matrix){
        int[] row= new int[matrix.length];
        int[] col= new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        //now make entire row and col to zero

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                 if(row[i]==1 || col[j]==1){
                     matrix[i][j]=0;
                 }
            }
        }

        //print the matrix
        for(int[] arr:matrix){
            for(int num:arr){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

    /***
     * 
     */


}

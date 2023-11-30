package Matrix;
import java.util.Arrays;

/***
 * https://leetcode.com/problems/spiral-matrix-ii/description/
 * This problem is as same as Spiral Matrix I. Only difference here is that we have to create the matrix and print it.
 */
public class SpiralMatrixII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateMatrix(3)));
    }
    public static int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int count=1;
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        while(right>=left){
            //covering top edge- going left to right- row will be constant. col will change
            for(int i=left;i<=right;i++){
                matrix[top][i]=count;
                count+=1;
            }
            top++;
            //covering rightmost edge- going top to bottom- col will be constant. row will change
            for(int i=top;i<=bottom;i++){
                matrix[i][right]=count;
                count+=1;
            }
            right--;
            //covering bottom edge- going right to left- row will be constant. col will change
            //here we also have to check if top is greater than bottom then only this will execute
            if(bottom>=top){
                for(int i=right;i>=left;i--){
                    matrix[bottom][i]=count;
                    count+=1;
                }
                bottom--;
            }
            //covering leftmost edge- going bottom to top- col will be constant. row will change
            //here also we have to check if right value is greater than or equal to left or not
            if(right>=left){
                for(int i=bottom;i>=top;i--){
                    matrix[i][left]=count;
                    count+=1;
                }
                left++;
            }
        }
        return matrix;
    }
}

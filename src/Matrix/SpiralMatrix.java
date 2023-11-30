package Matrix;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * https://leetcode.com/problems/spiral-matrix/description/
 *
 Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 Output: [1,2,3,6,9,8,7,4,5]
 */

public class SpiralMatrix {
    public static void main(String[] args) {

       // int[][] Matrix={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int[][] Matrix={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(solveSpiral(Matrix));

    }

    static List<Integer> solveSpiral(int[][] matrix){
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        List<Integer> list= new ArrayList<>();
        while(right>=left){
            //covering top edge- going left to right- row will be constant. col will change
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            //covering rightmost edge- going top to bottom- col will be constant. row will change
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            //covering bottom edge- going right to left- row will be constant. col will change
            //here we also have to check if top is greater than bottom then only this will execute
            if(bottom>=top){
                for(int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //covering leftmost edge- going bottom to top- col will be constant. row will change
            //here also we have to check if right value is greater than or equal to left or not
            if(right>=left){
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }

        }

        return list;

    }
}

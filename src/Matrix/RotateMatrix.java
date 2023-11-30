package Matrix;

/**
 *  Input_Matrix={
 *      {1,2,3},
 *      {4,5,6},
 *      {7,8,9}
 *      }
 *  Output_Matrix={
 *      {7,4,1},
 *      {8,5,2},
 *      {9,6,3}
 *  }
 *  Time Complexity: O(N^2)
 *  Space Complexity: O(1)
 */
public class RotateMatrix {
    public static void main(String[] args) {
            int[][] Matrix={
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            };
            RotateMatrix(FindTranspose(Matrix));
    }
    /**Transpose of a matrix**/
    static int[][] FindTranspose(int[][] Matrix){
        for(int r=0;r<Matrix.length;r++){
            for(int c=0;c<Matrix[0].length;c++){
                if(r<c){//It will take only upper half of the matrix. i.e. upper triangle
                    //swapping the element
                    int temp=Matrix[r][c];
                    Matrix[r][c]=Matrix[c][r];
                    Matrix[c][r]=temp;
                }
            }
        }
        return Matrix;
    }
    /**
     * Changing the column of a matrix
     */
    public static void RotateMatrix(int[][] Matrix){
        for(int r=0;r<Matrix.length;r++){
            for(int c=0;c<Matrix[0].length/2;c++){
                int temp= Matrix[r][c];
                Matrix[r][c]=Matrix[r][Matrix[0].length-c-1];
                Matrix[r][Matrix[0].length-c-1]=temp;
            }
        }

        /**
         * Printing the rotated matrix
         */
        for(int[] arr:Matrix){
            for(int num:arr){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}

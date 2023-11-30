package Searching;

public class BinarySearchIn_2DArray {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int[] output= findValue(matrix,7);
        for(int num: output){
            System.out.print(num+" ");
        }

    }

    public static int[] findValue(int[][] matrix, int target){
        int row=0;
        int col=matrix.length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }
            if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};

    }
}

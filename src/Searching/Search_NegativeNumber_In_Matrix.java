package Searching;

public class Search_NegativeNumber_In_Matrix {

    public static void main(String[] args) {

        int[][] Matrix={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int count=0;
        for(int r=0; r<Matrix.length;r++){
            for(int c=0;c<Matrix[0].length;c++){
                if(Matrix[r][c]<0){
                    count++;
                }
            }
        }
        System.out.println("No. of negative numbers: "+count);

        int row=0;
        int col=Matrix[0].length-1;
        while(row<Matrix.length && col>0){
            if(Matrix[row][col]>0){
               col--;
               row++;
            }else{
                col--;
                row=0;
            }
        }

    }


}

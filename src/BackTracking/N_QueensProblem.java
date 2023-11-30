package BackTracking;
/**
 * Time complexity: O(N!)
 * Space complexity: O(N^2)
 */
public class N_QueensProblem {
    public static void main(String[] args) {
            int n=4;
            boolean[][] board=new boolean[n][n];
            queens(board,0);
        System.out.println(queens(board,0));
    }

    static int queens(boolean[][] board, int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        //placing the queen and check if the place is safe or not
        for(int col=0;col<board.length;col++){
            if(isSafe(board, row,col)){
                board[row][col]=true;
                count+=queens(board,row+1);
                board[row][col]=false;
            }
        }
        return count;

    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check vertical row
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
            //diagonal left
            int maxLeft=Math.min(row,col);
            for(int j=1;j<=maxLeft;j++){
                if(board[row-j][col-j]){
                    return false;
                }
            }

            //diagonal right
            int maxRight=Math.min(row,board.length-col-1);
            for(int j=1;j<=maxRight;j++){
                if(board[row-j][col+j]){
                    return false;
                }
            }


        }
        return true;
    }

    private static void display(boolean[][] board) {
         for(boolean[] bool:board){
             for(boolean b:bool){
                 if(b){
                     System.out.print("Q");
                 }
                 else{
                     System.out.print("X");
                 }
             }
             System.out.println();
         }
    }
}

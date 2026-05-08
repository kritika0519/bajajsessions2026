import java.util.*;
class Solution {

    public List<List<String>> solveNQueens(int n) {
        char [][] board= new char[n][n];
        for(char[] row: board){
            Arrays.fill(row,'.');
        }
        List<List<String>> ans= new ArrayList<>();
        queen(board, 0, ans);
        return ans;
    }

    public void queen(char[][] board, int row, List<List<String>> ans){
        int n= board.length;
        if(row==n) {
            ans.add(makeString(board));
            return;
        }
        for(int col=0;col<n;col++){
            if(isSafe(board, row, col)){
                board[row][col]='Q';
                queen(board, row+1, ans);
                board[row][col] = '.';
            }
        }

    }
    
    public boolean isSafe(char[][] board, int row, int col){
        //vertical row
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q') return false;
        }
        
        //left diagonal
        int maxLeft=Math.min(row, col);
        for(int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i]=='Q') return false;
        }

        // right diagonal
        int maxRight=Math.min(row, board.length-1-col);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]=='Q') return false;
        }

        return true;
    }

    public List<String> makeString(char[][] board){
        List<String> str= new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String row= new String(board[i]);
            str.add(row);
        }
        return str;
    }

}
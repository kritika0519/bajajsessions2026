class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    public boolean solve(char[][] board){
        // traverse
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                // check need to fill
                if(board[i][j]=='.'){
                    // check the number to be fill
                    for(char ch='1';ch<='9';ch++){
                        //check num can be filled or not
                        if(isValid(board, i, j, ch)){
                            board[i][j]=ch;
                            if(solve(board))
                                return true;
                            board[i][j]='.';
                        }
                    }
                    // if no num satisty return false and backtrack
                    return false;
                }
            }
        }
        return true;          
    }

    public boolean isValid(char[][] board, int row, int col, char ch){
        for(int i=0;i<9;i++){
            if(board[row][i]==ch || board[i][col]==ch) return false;
            //if(board[i][col]==ch) return false;
            int boxR = 3*(row/3) +i/3;
            int boxC = 3*(col/3) +i%3;
            if(board[boxR][boxC]==ch) return false;
        }
        return true;
    }
}
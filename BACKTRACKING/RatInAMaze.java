import java.util.*;

class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        int n= maze.length;
        ArrayList<String> ans= new ArrayList<>();
        boolean[][] vis= new boolean[n][n];
        
        if (maze[0][0] == 0) return ans;
        
        solve(ans, 0, 0, maze, n, "", vis);
        return ans;
    }
    
    public void solve(ArrayList<String> ans, int r, int c, int[][] maze, int n, String p, boolean[][] vis){
        if(r==n-1 && c==n-1 && maze[r][c]!=0) {
            ans.add(p);
            return;
        } 
        if(r>=0 && r<n && c>=0 && c<n){ // corners checek
            if(vis[r][c]==true || maze[r][c]==0) { // already visited or cannot be visited
                return;
            }
            
            vis[r][c]=true;
            
            //down
            solve(ans, r+1, c, maze, n, p+'D', vis);
            //left
            solve(ans, r, c-1, maze, n, p+'L', vis);
            //right
            solve(ans, r, c+1, maze, n, p+'R', vis);
            //up
            solve(ans, r-1, c, maze, n, p+'U', vis); 
            
            vis[r][c]=false;
        
        }
    }
}
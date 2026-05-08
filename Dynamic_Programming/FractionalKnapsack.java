import java.util.*;
public class FractionalKnapsack {
    static int[][]dp;
    // // recursive code:-
    // public static int profit(int i, int[] wt, int[]val, int C){

    //     if(i==wt.length) return 0;
        
    //     int skip = profit(i+1, wt, val, C);
    //     if(wt[i]>C) return skip;
    //     int take = val[i]+ profit(i+1, wt, val, C-wt[i]);
        
    //     return Math.max(take, skip);
    // }
    public static void main(String[] args) {
        int[] wt={4,5,1};
        int[] val={1,2,3};
        int capacity=4;

       // System.out.println(profit(0, wt, val, capacity));
       System.out.println(knapsack(val, wt, capacity));
    }

    public static int knapsack(int[]val, int[] wt, int C){
        int n= val.length;
        dp=new int[n][C+1];

        for(int [] rows: dp){
            Arrays.fill(rows, -1);
        }

        return solve(0, val, wt, C);
    }

    public static int solve(int i, int[]val, int[]wt, int C ){
        if(i==val.length || C==0) return 0;
        if(dp[i][C]!=-1) return dp[i][C];

        int skip=solve(i+1, val, wt, C);

        int take=0;
        if(wt[i]<=C){
            take=val[i]+ solve(i+1, val, wt, C-wt[i]);
        }

        return dp[i][C]= Math.max(skip, take);
    }
}

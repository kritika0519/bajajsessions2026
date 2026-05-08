// Calculate total possible number of ways to climb a a stairs if a person can climb only 1 or 2 stairs at a time
public class ClimbStairs {
    public static int Climb(int stairs){
        if(stairs==0 || stairs==1) return 1;
        return Climb(stairs-1)+Climb(stairs-2);
    }
    public static void main(String[] args) {
        int stairs=7;
        int ways=Climb(stairs);
        System.out.println("Total possible ways:- "+ways);
    }
}

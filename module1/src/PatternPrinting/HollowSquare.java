package PatternPrinting;

public class HollowSquare {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==0 || i==n || j==0 || j==n){
                System.out.print("*");
                }
            }
            System.out.println();

        }
    }
}

package PatternPrinting;

public class HollowDiamond {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<2*n;i++){
            int num=n;
            for(int j=0;j<2*n-1;j++){
                System.out.print("*");
                num--;
            }
            for(int k=0;k<2*n-num;k++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }

}
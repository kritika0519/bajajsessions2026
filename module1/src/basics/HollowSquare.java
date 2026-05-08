package basics;

public class HollowSquare {
    public static void main(String[] args) {
        int r=4;
        for(int i=0;i<r*2-1;i++){
            for(int j=0;j<r*2-1;j++){
                if(i==0 || i==r*2){
                System.out.print(i+" ");
                }
                else if(j==0 || j==r*2-2){
                    System.out.print(i);
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

package basics;

public class sandStylishTimerPatternPrinting {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n*2-1;i++){
            for(int j=0;j<n*2-1;j++){
                if(i==0 || i==n-1){
                    System.out.print(j);
                }
                else if(i==j){
                    for(int a=0;a<n;a++){
                        System.out.print(" ");
                    }
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}

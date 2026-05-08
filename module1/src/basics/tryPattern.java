package basics;

public class tryPattern {
    public static void main(String[] args) {
        int r=4;
        
        for(int i=0;i<r*2-1;i++){
            for(int j=0;j<r*2-1;j++){
                if(i==0 || i==r*2-2 || j==0 ||j==r*2-2){
                    System.out.print(r+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
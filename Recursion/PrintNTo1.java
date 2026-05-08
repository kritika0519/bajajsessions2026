public class PrintNTo1 {
    public static void print(int num){
        if(num==0) return;//base case
        System.out.print(num+" ");//work
        print(num-1);//call
        
    }
    public static void main(String[] args) {
        print(10);
    }
}

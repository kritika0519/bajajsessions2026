public class PrintFibonnaciSeries {
    static int n1 = 0, n2 = 1;
    public static void fib(int n){
        if (n == 0) return;
        System.out.print(n1 + " ");
        int next = n1 + n2;
        n1 = n2;
        n2 = next;
        fib(n - 1);   
    }

    public static void main(String[] args) {
        int num=10;
        fib(num);
    }
}

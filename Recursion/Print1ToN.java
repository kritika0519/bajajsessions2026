public class Print1ToN {
    public static void print(int num){
        if(num == 0) return;// base case
        print(num - 1); // call
        System.out.print(num + " "); // work
    }
    public static void main(String[] args) {
        int num = 30;
        print(num);
    }
}

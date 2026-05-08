public class power {

    // time complexity O(b)
    public static int power(int a, int b){
        if(a==0 || b==0) return 1;
        return a*power(a,b-1);
    }

    //time complexity O(log b)
    public static int pow(int a, int b){
        if(a==0|| b==0) return 1;
        int half=power(a,b/2);
        if(b%2==0) return half*half;
        else return a*half*half;
    }
    public static void main(String[] args) {
        int a=2;
        int b=10;
        
        //time complexity O(log b)
        System.out.println(pow(a,b));

        // time complexity O(b)
        System.out.println(power(a,b));
    }
}

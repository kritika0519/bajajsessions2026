package loops;

public class NumberPalindrome {
    public static void main(String[] args) {
        int num=12322;
        int original=num;
        int reverse=0;
        while(num>0){
            int r=num%10;
            reverse=reverse*10+r;
            num/=10;
        }

        if(original==reverse){
            System.out.println("Palindrome");
        }
        else if(original !=reverse){
            System.out.println("not palindrome");
        }
        // System.out.println(reverse);
    }
}

public class PermutationOfString {
    public static void main(String[] args) {
        String str="ABCD";
        permute("", str);
    }
    public static void permute(String ans, String str){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i< str.length();i++){
            char ch=str.charAt(i);
            String left=str.substring(0,i);
            String right=str.substring(i+1);
            permute( ans+ch , left+right);
        }
    }
}



/*
import java.util.*;

public class Main {
    static void permute(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left = s.substring(0, i);
            String right = s.substring(i + 1);
            permute(left + right, ans + ch);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        permute(s, "");
    }
}

*/
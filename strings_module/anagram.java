package strings_module;

import java.util.Arrays;
//wheather str a is jumbel letter of str b
public class anagram {
    public static void main(String[] args) {
        String a="anagram";
        String b ="ramanag";

        boolean bool= isAnagram(a, b);
        if(bool==false)
            System.out.println("Not a Anagram");
        
        else
            System.out.println("is Anagram");
    }

    public static boolean isAnagram(String a,String b){
    //approach: sort both string and check their index
        if(a.length()!=b.length()){
            return false;
        }

        char[] ach=a.toCharArray();
        char[] bch =b.toCharArray();

        Arrays.sort(ach);
        Arrays.sort(bch);

        for(int i=0;i<a.length();i++){
            if(ach[i]!=bch[i]){  
                return false;
            }
        }

        return true;
    }
}

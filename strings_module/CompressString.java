package strings_module;

import java.util.*;

public class CompressString {
    public static void main(String[] args) {
        String s = "aaabbbccrrrkkstt";
        char[] arr = s.toCharArray();

        StringBuilder ans=new StringBuilder("");
        int i = 0;
        int j = 0;

        while (j < arr.length) {
            if (arr[i] == arr[j]) {
                j++;
            } 
            else {
                ans.append(arr[i]);
                int count = j - i;
                if (count > 1)
                    ans.append(count);
                i = j;
            }
        }
        ans.append(arr[i]);
        int count = j - i;
        if (count > 1)
            ans.append(count);


        for(int c=0;c<ans.length();c++){
            arr[c]=ans.charAt(c);
        }
        
        for(int ele:arr){
            System.out.print(arr[ele]);
        }
        System.out.println(ans);

    }

}

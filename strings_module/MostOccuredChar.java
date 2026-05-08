package strings_module;

//Given a string consisting of lowercase English alphabets. Print the character that is occurring most number of times.
import java.util.Arrays;

public class MostOccuredChar {
    public static void main(String[] args) {
        String str = "kartikeyyyyya jain";
        char[] ch = str.toCharArray();

        Arrays.sort(ch);

        int maxCount = 0;
        int count = 1;
        char c = ch[0];
        for (int i = 1; i < str.length(); i++) {
            if (ch[i] == ch[i - 1]) {
                count++;
            } else {
                if (count >= maxCount) {
                    maxCount = count;
                    c = ch[i - 1];
                }
                count = 1;
            }
        }

        if (count > maxCount) {
            maxCount = count;
            c = ch[ch.length - 1];
        }

        System.out.println("char " + c + " number of times:" + maxCount);
    }
}

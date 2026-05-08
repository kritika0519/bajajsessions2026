package stringBuilder_module;

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        int len = sb.length();
        for (int i = 0; i < len; i++) {
            char ch = sb.charAt(i);
            int ascii = (int) ch;
            // capital to small
            if (ascii >= 65 && ascii <= 90) {
                ascii += 32;
            }
            // small to capital
            else if (ascii >= 97 && ascii <= 122) {
                ascii -= 32;
            }
            ch = (char) ascii;
            sb.setCharAt(i, ch);

        }

        System.out.println("toggle string is:- " + sb);
    }
}

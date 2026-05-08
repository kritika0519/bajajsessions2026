package strings_module;
//conerst to char array then sort

import java.util.Arrays;

public class SortingInString {
    public static void main(String[] args) {
        String str="kartikeya";
        char[] ch=str.toCharArray();

        for(char ele:ch){
            System.out.print(ele);
        }
        System.out.println();
        Arrays.sort(ch);
        for(char ele:ch){
            System.out.print(ele);
        }
        System.out.println();

        StringBuilder sb=new StringBuilder(str);
        char[] arr = sb.toString().toCharArray();

    }   
}

package stringBuilder_module;

import java.util.*;

public class ReverseEachWordOfGivenSentence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //String str="i am kartik jain";
        StringBuilder sb=new StringBuilder(sc.nextLine());
        sb.append(' ');
        
        int len=sb.length();
        
        //using 2 pointers approach

        int i=0;
        int j=0;
        while(j<len){
            if(sb.charAt(j)!=' '){
                j++;
            }
            else{
                reverse(sb,i,j-1);
                i=j+1;
                j=i;
            }
        }
        
        System.out.println(sb);

        // String[] words = str.split(" ");
        // StringBuilder result=new StringBuilder();

        // for(String word: words){
        //     StringBuilder temp=new StringBuilder(word);
        //     result.append(temp.reverse()).append(" ");
        // }
        
        // System.out.println("Reversed string is: "+ result.toString().trim());
    }

    public static void reverse (StringBuilder sb, int i, int j){
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;

        }

    }
}

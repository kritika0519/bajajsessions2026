package strings_module;

public class CountingVowels {
    public static void main(String[] args) {
        String str="hello my name is kartikeya jain";
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println("number of vowels in string:"+str+": "+count);
    }    
}

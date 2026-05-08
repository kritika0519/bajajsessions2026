package strings_module;

//Q11: Given n string consisting of digits from 0 to 9. Return the string which has maximum value.
//use of Integer.parseInt();
public class StringToInteger {
    public static void main(String[] args) {
        String[] str={"123","00126","8568","9752","9654"};
        int max=Integer.parseInt(str[0]);
        for(int i=0;i<str.length;i++){
            int num=Integer.parseInt(str[i]);
            if(num>max){
                max=num;
            }
        }

        System.out.println(max);

    }
}

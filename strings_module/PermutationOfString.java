import java.util.*;

public class PermutationOfString {
    public static void main(String[] args) {
        String s = "ABC";
        List<String> result = new ArrayList<>();
        permute(s.toCharArray(), 0, result);

        System.out.println("All permutations:");
        for (String str : result) {
            System.out.println(str);
        }
    }

    static void permute(char[] chars, int index, List<String> result) {
        if (index == chars.length - 1) {
            result.add(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            permute(chars, index + 1, result);
            swap(chars, index, i); // backtrack
        }
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

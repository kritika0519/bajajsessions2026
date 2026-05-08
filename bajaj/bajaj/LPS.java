public class LPS {
    public int[] computeLPS(String pat) {
        int m = pat.length();
        int[] lps = new int[m];
        int len = 0, i = 1;
        while(i < m) {
            if(pat.charAt(i) == pat.charAt(len)) {
                len++; lps[i++] = len;
            } else {
                if(len != 0) len = lps[len - 1];
                else lps[i++] = 0;
            }
        }
        return lps;
    }
}

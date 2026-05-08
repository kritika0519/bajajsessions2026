
package basics;

import java.util.*;

public class ZoomInPrinting {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n * 2 - 1; i++) {
            for (int j = 1; j <= n * 2 - 1; j++) {
                int a = i;
                int b = j;
                if (i > n) {
                    a = n * 2 - i;
                }
                if (j > n) {
                    b = n * 2 - j;
                }
                System.out.print(n - Math.min(a, b) + 1 + " ");
            }
            System.out.println();
        }
    }
}

package greedy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Programmers6 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {1, 2};
        int[] reserve = {2, 3};


        n -= lost.length;

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -10;
                    reserve[j] = -1;
                    n++;
                }
            }
        }

        for (int k : lost) {
            for (int j = 0; j < reserve.length; j++) {
                if (k == reserve[j] - 1 || k == reserve[j] + 1) {
                    n++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        System.out.println(n);
    }
}

package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11727 {
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        dp = new int[size + 1];
        dp[0] = dp[1] = 1;

        //top-down
        topDown(size);
        //bottom-up
//        bottomUp(size);

        System.out.print(dp[size]);
    }

    private static void bottomUp(int size) {
        for (int i = 2; i <= size; i++) {
            dp[i] = 2 * dp[i - 2] + dp[i - 1];
            dp[i] %= 10007;
        }
    }

    private static int topDown(int i) {
        if (dp[i] == 0) {
            dp[i] = topDown(i - 1) + 2 * topDown(i - 2);
            dp[i] %= 10007;
        }
        return dp[i];
    }
}

package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1463 {
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int val = Integer.parseInt(br.readLine());
        dp = new int[val + 1];

        //top-down
        sb.append(topDown(val));
        //bottom-up
//        sb.append(bottomUp(val));

        System.out.print(sb);
    }

    //        bottom-up
    public static int bottomUp(int n) {
        dp[0] = dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;    //i가 2로 나누어떨어지지않거나 3으로 나누어떨어지지않으면 적용될 값.
            if (i % 2 == 0)
                dp[i] = Math.min(dp[i / 2] + 1, dp[i]); //i가 되기위해 2로 나누는것이 횟수가 적은지 +1을 하는것이 적은지 검사후 더 작은값을 저장
            if (i % 3 == 0)
                dp[i] = Math.min(dp[i / 3] + 1, dp[i]); //i가 되기위해 3으로 나누는것이 횟수가 적은지 +1을 하는것이 적은지 검사후 더 작은값을 저장
        }
        return dp[n];
    }

    public static int topDown(int n) {
        if (n <= 1) //dp[0]=dp[1]=0
            return 0;
        if (dp[n] == 0) {//n번째 자리에 값이 0 이면 계산되지않앗다고 판단하고 연산
            dp[n] = topDown(n - 1) + 1;
            if (n % 2 == 0)
                dp[n] = Math.min(topDown(n / 2) + 1, dp[n]);
            if (n % 3 == 0)
                dp[n] = Math.min(topDown(n / 3) + 1, dp[n]);
            return dp[n];
        }
        return dp[n];
    }


}

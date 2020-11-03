package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dp {
    static int size;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());

        //피보나치 수열 구현
        //top-down
        System.out.println(topDown(size));

        //bottom-up
        System.out.println(bottomUp(size));

    }

    //top-down
    public static int topDown(int n){
        int[] dp = new int[size + 1];
        if (n<=1){ //dp[0],dp[1]일때 각각 0,1 을 대입
            dp[n]=n;
            return dp[n];}
        if(dp[n]==0){ //0이면 연산을하지않은걸로 취급해 계산해서 저장하기
            dp[n]=topDown(n-1)+topDown(n-2);
        }
        return dp[n];
    }

    //bottom-up
    public static int bottomUp(int n){
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) { //2,3,4,5...
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}

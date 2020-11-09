package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        System.out.print(factorial(n) / (factorial(k) * (factorial(n - k))));
    }

    public static int factorial(int i) {
        if (i <= 1) return 1;
        int val = i * factorial(i - 1);
        return val;
    }
}

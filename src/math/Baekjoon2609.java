package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] val = br.readLine().split(" ");
        int val1 = Integer.parseInt(val[0]);
        int val2 = Integer.parseInt(val[1]);

        //최대공약수 - 유클리드 호제법
        sb.append(gcd(val1, val2)).append("\n");
        //최소공배수
        sb.append(lcm(val1, val2));

        System.out.print(sb);
    }

    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

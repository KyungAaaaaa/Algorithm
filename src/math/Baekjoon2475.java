package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int result = 0;
        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(st.nextToken());
            result += (int) Math.pow(a, 2);
        }
        sb.append(result % 10);
        br.close();
        System.out.print(sb);
    }
}

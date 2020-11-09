package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] val = br.readLine().split(" ");
        int n = Integer.parseInt(val[0]);
        int m = Integer.parseInt(val[1]);
        int[] x = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(st.nextToken());
        }
        int min = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = x[i] + x[j] + x[k];
                    if (sum <= m && min <= sum) {
                        min = sum;
                    }
                }
            }
        }
        System.out.print(min);
    }
}

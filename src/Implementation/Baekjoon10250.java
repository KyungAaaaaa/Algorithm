package Implementation;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int f = n % h;
            int r = (n / h) + 1;
            if (f == 0) {
                f = h;
                r = n / h;
            }
            bw.append(String.valueOf(f)).append(r < 10 ? "0" + r : String.valueOf(r));
            bw.append("\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}

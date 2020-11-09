package sorting;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        int[][] array = new int[count][2];
        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array, (o1, o2) -> {
            if (o1[0] == o2[0]) return Integer.compare(o1[1], o2[1]);
            return Integer.compare(o1[0], o2[0]);
        });

        for (int[] is : array) bw.append(String.valueOf(is[0])).append(" ").append(String.valueOf(is[1])).append("\n");

        bw.flush();
        br.close();
        bw.close();
    }
}

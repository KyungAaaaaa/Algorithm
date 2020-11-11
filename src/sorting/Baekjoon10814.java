package sorting;

import java.io.*;
import java.util.Arrays;

public class Baekjoon10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        String[][] array = new String[count][2];

        for (int i = 0; i < count; i++)
            array[i] = br.readLine().split(" ");

        Arrays.sort(array, (s1, s2) -> {
            return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
        });

        for (String[] s : array)
            bw.append(s[0]).append(" ").append(s[1]).append("\n");

        bw.flush();
        br.close();
        bw.close();
    }
}

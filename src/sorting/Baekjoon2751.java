package sorting;

import java.io.*;
import java.util.*;

public class Baekjoon2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < count; i++)
            set.add(Integer.parseInt(br.readLine()));

        List<Integer> array = new ArrayList<>(set);

        Collections.sort(array);
        for (int v : array)
            bw.append(String.valueOf(v)).append("\n");

        bw.flush();
        br.close();
        bw.close();
    }
}

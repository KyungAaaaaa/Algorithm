package sorting;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Baekjoon2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(br.readLine()));
        }
        List<Integer> list = new ArrayList<>(set);
        list.sort((o1, o2) -> {return o1 - o2;}  );
        for (int val:list){
            bw.append(String.valueOf(val)).append("\n");
        }
        bw.flush();
        br.close();
        bw.close();

    }
}

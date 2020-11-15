package Implementation;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Baekjoon1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            str = br.readLine().split(" ");
            LinkedList<int[]> queue = new LinkedList<>();
            for (int j = 0; j < n; j++)
                queue.add(new int[]{j, Integer.parseInt(str[j])});

            int count = 0;
            while (!queue.isEmpty()) {
                int[] val = queue.poll();
                boolean flag = true;

                // 제일 앞 요소보다 큰 요소가 있는지 검사
               for (int[] target : queue)
                   // 맨 앞 요소가 제일 작다면
                    if (val[1]<  target[1]) flag = false;

                if (flag) {
                    count++;
                    if (val[0] == m) break;
                } else queue.offer(val);

            }
            bw.append(String.valueOf(count)).append("\n");
        }
        bw.flush();


    }
}

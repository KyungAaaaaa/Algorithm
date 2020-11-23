package datastructure;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        bw.append("<");
        int count = 0;
        while (!queue.isEmpty()) {
            if (count != 0) bw.append(", ");
            for (int i = 0; i < k-1; i++) {
                queue.offer(queue.poll());
            }
            bw.append(String.valueOf(queue.poll()));
            count++;
        }

        bw.append(">").flush();
    }
}

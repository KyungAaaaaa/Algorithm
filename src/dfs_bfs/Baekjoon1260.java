package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon1260 {
    static boolean[] checked; //확인 여부
    static int[][] check; //간선 연결상태
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        sb = new StringBuilder();
        int node = Integer.parseInt(str[0]) + 1;
        int size = Integer.parseInt(str[1]);
        int startNode = Integer.parseInt(str[2]);

        check = new int[node][node]; //좌표를 그대로 받아들이기 위해 +1해서 선언
        checked = new boolean[node]; //초기값 False

        //간선 연결상태 저장
        for (int i = 0; i < size; i++) {
            String[] edges = br.readLine().split(" ");
            int x = Integer.parseInt(edges[0]);
            int y = Integer.parseInt(edges[1]);
            check[x][y] = check[y][x] = 1;
        }
        dfs(node, startNode);

        checked = new boolean[node];
        sb.append("\n");

        bfs(node, startNode);

        System.out.print(sb);
    }

    public static void dfs(int node, int index) {
        checked[index] = true;
        sb.append(index).append(" ");

        for (int i = 0; i < node; i++) {
            if (check[index][i] == 1 && checked[i] == false) {
                dfs(node, i);

            }
        }

    }

    public static void bfs(int size, int index) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(index);
        checked[index] = true;
        sb.append(index).append(" ");
        while (!queue.isEmpty()) {
            Integer temp = queue.poll();
            for (int j = 1; j < size; j++) {
                if (check[temp][j] == 1 && !checked[j]) {
                    queue.offer(j);
                    checked[j] = true;
                    sb.append(j).append(" ");
                }
            }
        }
    }
}
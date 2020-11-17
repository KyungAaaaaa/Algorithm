package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon2178 {
    static int n;
    static int m;
    static int[][] map;
    static int[][] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        map = new int[100 + 1][100 + 1];
        visit = new int[100 + 1][100 + 1];

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(line[j]);
            }
        }

        Queue<Integer> qX = new LinkedList<>();
        Queue<Integer> qY = new LinkedList<>();
        Queue<Integer> qC = new LinkedList<>();
        qX.offer(0);
        qY.offer(0);
        qC.offer(1);

        while (!qY.isEmpty()) {
            int x = qX.poll();
            int y = qY.poll();
            int c = qC.poll();
            if (visit[y][x] == 1) continue;
            visit[y][x] = 1;
            if (y == n - 1 && x == m - 1) {
                System.out.println(c);
                break;
            }


            //상
            if (check(y - 1, x)) {
                qX.offer(x);
                qY.offer(y - 1);
                qC.offer(c + 1);
            }

            //하
            if (check(y + 1, x)) {
                qX.offer(x);
                qY.offer(y + 1);
                qC.offer(c + 1);

            }

            //좌
            if (check(y, x - 1)) {
                qX.offer(x - 1);
                qY.offer(y);
                qC.offer(c + 1);

            }

            //우
            if (check(y, x + 1)) {
                qX.offer(x + 1);
                qY.offer(y);
                qC.offer(c + 1);

            }
        }


    }

    private static boolean check(int y, int x) {
        if (y < 0 || y > n || x < 0 || x > m) return false;
        if (map[y][x] == 0) return false;
        if (visit[y][x] == 1) return false;
        return true;
    }
}

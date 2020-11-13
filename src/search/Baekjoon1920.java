package search;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer stN = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(stN.nextToken());
        }
        Arrays.sort(a);

        int m = Integer.parseInt(br.readLine());
        StringTokenizer stM = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {

            if (binarySearch(a, Integer.parseInt(stM.nextToken())) == -1) bw.append(String.valueOf(0));
            else bw.append(String.valueOf(1));
            bw.append("\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    // 이분 탐색
    public static int binarySearch(int[] array, int num) {
        int start = 0;
        int end = array.length - 1;

        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (array[mid] == num) {
                return array[mid];
            } else if (array[mid] > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

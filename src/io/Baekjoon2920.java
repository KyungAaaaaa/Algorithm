package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int start = Integer.parseInt(st.nextToken());
//        int ascending = 0;
//        int descending = 0;
//        if (start == 1) {
//            for (int i = 2; i <= 8; i++) {
//                if (Integer.parseInt(st.nextToken()) == i) ascending++;
//            }
//        } else if (start == 8) {
//            for (int i = 7; i >= 1; i--) {
//                if (Integer.parseInt(st.nextToken()) == i) descending++;
//            }
//        }
//
//        if (ascending == 7) System.out.print("ascending");
//        else if (descending == 7) System.out.print("descending");
//        else System.out.print("mixed");
        String str = br.readLine();
        if (str.equals("1 2 3 4 5 6 7 8")) System.out.print("ascending");
        else if (str.equals("8 7 6 5 4 3 2 1")) System.out.print("descending");
        else System.out.print("mixed");
        br.close();
    }
}

package bruteforce;

import java.io.*;

public class Baekjoon1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] size = br.readLine().split(" ");
        int x = Integer.parseInt(size[1]);
        int y = Integer.parseInt(size[0]);
        String[][] squareB = {
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"}};
        String[][] squareW = {
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"}};

        //입력값 넣어주기
        String[][] input = new String[y][x];
        for (int i = 0; i < y; i++) {
            String[] str = br.readLine().split("");
            for (int j = 0; j < x; j++) {
                input[i][j] = str[j];
            }
        }

        int min = 64;
        // 입력값이 8x8 초과일 경우
        // 8x8 크기로 자를수있는 기준 인덱스(시작점)로 이동해서 8x8 크기만큼 검사
        for (int z = 0; z <= ((y > 8) ? y - 8 : 0); z++) {
            for (int k = 0; k <= ((x > 8) ? x - 8 : 0); k++) {
                int countW = 0;
                int countB = 0;
                for (int i = z; i < 8 + z; i++) {
                    for (int j = k; j < 8 + k; j++) {
                        //다시 칠해야하는 갯수
                        //흰색으로 시작하는 경우
                        if (!input[i][j].equals(squareW[i - z][j - k])) countW++;

                        //검정으로 시작하는경우
                        if (!input[i][j].equals(squareB[i - z][j - k])) countB++;
                    }
                }
                // 더 작은수를 최솟값으로 저장
                min = Math.min(countW, min);
                min = Math.min(countB, min);
            }
        }
        System.out.println(min);
        br.close();
    }
}

package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        System.out.println(quadrant(x, y));
    }

    public static int quadrant(int x, int y) {
        if (x > 0) {
            if (y > 0) return 1;
            else return 4;
        } else {
            if (y > 0) return 2;
            else return 3;
        }
    }
}

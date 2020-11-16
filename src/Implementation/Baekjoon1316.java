package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < count; i++) {
            String[] str = br.readLine().split("");
            boolean flag = true;

            for (int j = 0; j < str.length - 1; j++) {
                if (!flag) break;
                if (!str[j].equals(str[j + 1])) {
                    for (int k = 0; k < j; k++) {
                        if (str[j + 1].equals(str[k])) {
                            flag = false;
                            break;
                        }
                    }
                }
            }
            if (flag) sum++;
        }
        System.out.println(sum);
    }
}

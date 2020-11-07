package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String val = br.readLine();
        while (!val.equals("0")) {
            boolean flag = true;
            int i = 0;
            int j = val.length() - 1;
            while (i < j) {
                if (val.charAt(i) == val.charAt(j)) {
                    i++;
                    j--;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) sb.append("yes");
            else sb.append("no");
            val = br.readLine();
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

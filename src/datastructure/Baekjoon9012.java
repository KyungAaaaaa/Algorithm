package datastructure;

import java.io.*;
import java.util.Stack;

public class Baekjoon9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            Stack<String> stack = new Stack<>();
            String[] str = br.readLine().split("");
            boolean flag = true;
            for (String s : str) {
                if (s.equals("(")) {
                    stack.push(s);
                } else if (s.equals(")")) {
                    if (stack.isEmpty()) {
                        flag = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if (!stack.isEmpty()) bw.append("NO");
            else if (!flag) bw.append("NO");
            else bw.append("YES");
            bw.append("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

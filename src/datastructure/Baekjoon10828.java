package datastructure;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Baekjoon10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());

        Stack s = new Stack();
        for (int i = 0; i < count; i++) {
            String str = br.readLine();
            if (str.contains("push")) {
                String[] temp = str.split(" ");
                int val = Integer.parseInt(temp[1]);
                s.push(val);
            } else if (str.equals("top")) {
                bw.append(String.valueOf(s.peek())).append("\n");
            } else if (str.equals("size")) {
                bw.append(String.valueOf(s.size())).append("\n");
            } else if (str.equals("empty")) {
                bw.append(String.valueOf(s.empty())).append("\n");
            } else if (str.equals("pop")) {
                bw.append(String.valueOf(s.pop())).append("\n");
            }

        }
        bw.flush();
    }

    static class Stack {
        private int top;
        private List<Integer> stack;

        public Stack() {
            this.top = -1;
            this.stack = new ArrayList<>();
        }

        private void push(int n) {
            top++;
            stack.add(n);
        }

        private int peek() {
            if (top < 0) return -1;
            return stack.get(top);
        }

        private int empty() {
            if (stack.size() == 0) return 1;
            return 0;
        }

        private int size() {
            return stack.size();
        }

        private int pop() {
            if (top < 0) return -1;
            int val = stack.get(top);
            stack.remove(top);
            top--;
            return val;
        }
    }

}



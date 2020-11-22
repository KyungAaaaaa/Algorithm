package datastructure;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Baekjoon10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());

        Queue queue = new Queue();
        for (int i = 0; i < count; i++) {
            String str = br.readLine();
            if (str.contains("push")) {
                String[] temp = str.split(" ");
                int val = Integer.parseInt(temp[1]);
                queue.push(val);
            } else if (str.equals("front")) {
                bw.append(String.valueOf(queue.front())).append("\n");
            } else if (str.equals("back")) {
                bw.append(String.valueOf(queue.back())).append("\n");
            } else if (str.equals("size")) {
                bw.append(String.valueOf(queue.size())).append("\n");
            } else if (str.equals("empty")) {
                bw.append(String.valueOf(queue.empty())).append("\n");
            } else if (str.equals("pop")) {
                bw.append(String.valueOf(queue.pop())).append("\n");
            }

        }
        bw.flush();
    }

    static class Queue {
        private int top;
        private List<Integer> queue;

        public Queue() {
            this.top = -1;
            this.queue = new ArrayList<>();
        }

        private void push(int n) {
            top++;
            queue.add(n);
        }

        private int pop() {
            if (queue.size() == 0) return -1;
            top--;
            int val = queue.get(0);
            queue.remove(0);
            return val;
        }

        private int front() {
            if (queue.size() == 0) return -1;
            return queue.get(0);
        }

        private int back() {
            if (queue.size() == 0) return -1;
            return queue.get(top);
        }

        private int size() {
            return queue.size();
        }

        private int empty() {
            if (queue.size() == 0) return 1;
            return 0;
        }

    }

}



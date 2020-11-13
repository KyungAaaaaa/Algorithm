package datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int max = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= max; i++) {
            queue.offer(i);
        }
        while (queue.size() > 1) {
            queue.remove();
            queue.offer(queue.poll());
        }
        System.out.println(queue.peek());
    }
}

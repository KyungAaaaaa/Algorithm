package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class Programmers13 {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};

        int[] endTime = new int[truck_weights.length];
        Queue<Integer> bridge = new LinkedList<>();
        int time = 0;
        int current = 0;
        while (true) {
            //도착한 버스 제거
            if (!bridge.isEmpty() && endTime[bridge.peek()] == time) {
                weight += truck_weights[bridge.poll()];
            }

            //다리를 건너는 버스
            if (current < truck_weights.length && weight >= truck_weights[current]) {
                bridge.offer(current);
                weight -= truck_weights[current];
                endTime[current] = time + bridge_length;
                current++;
            }
            time++;
            if (bridge.isEmpty()) break;
        }
        System.out.println(time);
    }
}

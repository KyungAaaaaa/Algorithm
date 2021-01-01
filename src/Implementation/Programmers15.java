package Implementation;

import java.util.*;

public class Programmers15 {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};


        Double[] successRate = new Double[N];

        for (int i = 1; i <= N; i++) {
            double success = 0.0;
            double fail = 0.0;
            for (int stage : stages) {
                if (i == stage) fail++;
                else if (i < stage) success++;
            }
            if (success == 0 && fail == 0) successRate[i - 1] = 0.0;
            else successRate[i - 1] = fail / success;
        }


        Map<Integer, Double> result = new HashMap<>();
        for (int i = 1; i <= successRate.length; i++)
            result.put(i, successRate[i - 1]);

        ArrayList<Integer> keySetList = new ArrayList<>(result.keySet());
        keySetList.sort((o1, o2) -> result.get(o2).compareTo(result.get(o1)));
        int[] result2 = keySetList.stream().mapToInt(i -> i).toArray();

//        Arrays.stream(result2).forEach(System.out::println);

    }
}

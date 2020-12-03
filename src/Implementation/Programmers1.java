package Implementation;

import java.util.HashSet;

public class Programmers1 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 1, 4, 1};

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++)
            for (int j = i + 1; j < numbers.length; j++)
                set.add(numbers[i] + numbers[j]);


        int[] answer = set.stream().sorted().mapToInt(i -> i).toArray();
//        return answer;
    }
}

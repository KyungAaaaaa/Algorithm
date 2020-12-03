package Implementation;

import java.util.ArrayList;

public class Programmers2 {
    public static void main(String[] args) {
        int[] answers = {1, 3, 2, 4, 2};

        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int sumA = 0;
        int sumB = 0;
        int sumC = 0;

        for (int i = 0; i < answers.length; i++) {
            if (first[i % first.length] == answers[i]) sumA++;
            if (second[i % second.length] == answers[i]) sumB++;
            if (third[i % third.length] == answers[i]) sumC++;
        }
        ArrayList<Integer> answer = new ArrayList<>();
        int max = Math.max(Math.max(sumA, sumB), sumC);
        if (sumA == max) answer.add(1);
        if (sumB == max) answer.add(2);
        if (sumC == max) answer.add(3);

        int[] result = answer.stream().mapToInt(i -> i).toArray();
//        return answer.stream().mapToInt(i -> i).toArray();;
    }

}

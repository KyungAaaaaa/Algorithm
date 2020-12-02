package Implementation;

import java.util.ArrayList;
import java.util.Stack;

public class ProgrammersKakaoCrane {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};


        int answer = 0;

        ArrayList<Stack<Integer>> stackList = new ArrayList<>();
        Stack<Integer> result = new Stack<>();
        result.push(0);
        for (int i = 0; i < board.length; i++) {
            stackList.add(new Stack<>());
            for (int j = board.length - 1; j >= 0; j--)
                if (board[j][i] != 0)
                    stackList.get(i).push(board[j][i]);

        }

//        stackList.forEach(System.out::println);

        for (int i : moves) {
            if (!stackList.get(i - 1).isEmpty()) {
                if (result.peek().equals(stackList.get(i - 1).peek())) {
                    stackList.get(i - 1).pop();
                    result.pop();
                    answer += 2;
                } else
                    result.add(stackList.get(i - 1).pop());
            }
        }

//        result.forEach(System.out::println);


        System.out.println("answer : " + answer);
    }
}

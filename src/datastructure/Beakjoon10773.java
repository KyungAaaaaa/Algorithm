package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Beakjoon10773 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack<Integer> stack = new Stack<Integer>();
		int count = Integer.parseInt(br.readLine());
		for (int i = 0; i < count; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num != 0) {
				stack.push(num);
			} else {
				stack.pop();
			}
		}

		int answer=0;
		for (Integer integer : stack) {
			answer+=integer;
		}
		System.out.println(answer);

	}

}

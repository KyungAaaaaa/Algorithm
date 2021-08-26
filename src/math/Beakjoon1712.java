package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon1712 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] st = br.readLine().split(" ");

		int[] input = new int[st.length];

		for (int i = 0; i < input.length; i++) 
			input[i] = Integer.parseInt(st[i]);
		

		int cost = input[2] - input[1];
		int answer = cost < 1 ? -1 : input[0] / cost + 1;
		System.out.println(answer);
	}

}

package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2839 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int answer = 0;
		// 규칙 하나하나찾기.....
		// 풀이봄 ㅠ 제일 어렵다
		if (n == 4 || n == 7)
			answer = -1;
		else if (n % 5 == 0)
			answer = n / 5;
		else if (n % 5 == 3 || n % 5 == 1)
			answer = n / 5 + 1;
		else if (n % 5 == 4 || n % 5 == 2)
			answer = n / 5 + 2;

		System.out.println(answer);

	}

}

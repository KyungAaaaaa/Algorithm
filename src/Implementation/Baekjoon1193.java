package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1193 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());
		int num1 = 0;// 분자,분모가 될 기준 수
		int num2 = 0;// 위치

		while (num2 < x) {
			num1 += 1;
			num2 += num1;
		}

		int i = 1;
		int j = num1;

		while (x < num2--) {
			i++;
			j--;
		}
		
		// 짝수 j/i
		// 홀수 i/j
		int a = num1 % 2 == 0 ? j : i;
		int b = num1 % 2 == 0 ? i : j;
		System.out.println(a + "/" + b);

	}

}

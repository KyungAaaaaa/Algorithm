package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1193 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());
		int num1 = 0;// ����,�и� �� ���� ��
		int num2 = 0;// ��ġ

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
		
		// ¦�� j/i
		// Ȧ�� i/j
		int a = num1 % 2 == 0 ? j : i;
		int b = num1 % 2 == 0 ? i : j;
		System.out.println(a + "/" + b);

	}

}

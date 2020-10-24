package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon5585 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int price = Integer.parseInt(br.readLine());
		br.close();

		int change = 1000 - price;

		int result = (change / 500) + (change % 500 / 100) + (change % 500 % 100 / 50) + (change % 500 % 100 % 50 / 10)
				+ (change % 500 % 100 % 50 % 10 / 5) + (change % 500 % 100 % 50 % 10 % 5 / 1);

		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();

	}
}

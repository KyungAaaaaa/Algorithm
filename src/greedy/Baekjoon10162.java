package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon10162 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int time = Integer.parseInt(br.readLine());
		if (time % 10 != 0) {
			bw.write("-1");
		} else {
			int[] timeBtn = { 300, 60, 10 };
			String count = "";
			for (int i = 0; i < timeBtn.length; i++) {
				count += time / timeBtn[i] + " ";
				time %= timeBtn[i];
			}

			bw.write(String.valueOf(count));
		}

		bw.flush();
	}

}
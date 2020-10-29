package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10991 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder st = new StringBuilder();
		int count = Integer.parseInt(br.readLine());

		for (int i = 0; i < count; i++) {
			for (int j = count - i - 1; j > 0; j--) {
				st.append(" ");
			}
			for (int k = 0; k <= i; k++) {
				st.append("* ");
			}
			st.append("\n");
		}

		System.out.println(st);
	}
}

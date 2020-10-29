package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2446 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder st = new StringBuilder();
		int count = Integer.parseInt(br.readLine());

		for (int i = 0; i < count; i++) {
			for (int j = 0; j < i; j++) {
				st.append(" ");
			}
			for (int k = 0; k < (2 * (count - i)) - 1; k++) {
				st.append("*");
			}
			st.append("\n");
		}
		for (int i = count - 2; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				st.append(" ");
			}
			for (int k = 0; k < (2 * (count - i)) - 1; k++) {
				st.append("*");
			}
			st.append("\n");
		}

		System.out.println(st);
	}
}

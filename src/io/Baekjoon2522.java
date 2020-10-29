package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2522 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder st = new StringBuilder();
		int count = Integer.parseInt(br.readLine());

		for (int i = 1; i <= count; i++) {
			for (int j = 0; j < count - i; j++) {
				st.append(" ");
			}
			for (int k = 0; k < i; k++) {
				st.append("*");
			}

			st.append("\n");
		}

		for (int i = count - 1; i > 0; i--) {
			for (int j = 0; j < count - i; j++) {
				st.append(" ");
			}
			for (int k = 0; k < i; k++) {
				st.append("*");
			}

			st.append("\n");
		}
		System.out.println(st);
	}
}

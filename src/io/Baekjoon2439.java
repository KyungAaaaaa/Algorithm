package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2439 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder st = new StringBuilder();
		int count = Integer.parseInt(br.readLine());
		for (int i = count - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				st.append(" ");
			}
			for (int k = 0; k < count - i; k++) {
				st.append("*");
			}
			st.append("\n");
		}
		System.out.println(st);
	}
}

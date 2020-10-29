package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2438 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder st = new StringBuilder();
		int count = Integer.parseInt(br.readLine());
		for (int i = 1; i <= count; i++) {
			for (int j = 0; j < i; j++) {
				st.append("*");
			}
			st.append("\n");
		}
		System.out.println(st);
	}
}

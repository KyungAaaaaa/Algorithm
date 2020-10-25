package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10951 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		while ((str = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str);
			int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			sb.append(sum).append("\n");
		}
		System.out.println(sb);

	}
}

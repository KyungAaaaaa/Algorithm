package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2588 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int val1 = Integer.parseInt(br.readLine());
		int val2 = Integer.parseInt(br.readLine());
		int temp=val2;
		while (temp > 0) {
			System.out.println(val1 * (temp % 10));
			temp /= 10;
		}
		System.out.println(val1 * val2);
	}
}

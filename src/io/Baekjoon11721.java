package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11721 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		String value = br.readLine();
		String[] values = value.split("");
		for (int i = 0; i < values.length; i++) {
			if(i!=0 && i%10==0)sb.append("\n");
			sb.append(values[i]);
		}
		System.out.println(sb);
	}
}

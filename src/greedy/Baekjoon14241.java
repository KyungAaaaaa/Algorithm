package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon14241 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String count = br.readLine();
		StringTokenizer sizeList = new StringTokenizer(br.readLine());
		br.close();
		int[] size = new int[Integer.parseInt(count)];

		for (int i = 0; i < size.length; i++) {
			size[i] = Integer.parseInt(sizeList.nextToken());
		}

		int sum = 0;
		for (int i = 0; i < size.length - 1; i++) {
			for (int j = i + 1; j < size.length; j++) {
				sum += size[i] * size[j];
			}
		}

		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
	}
}

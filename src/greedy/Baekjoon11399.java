package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon11399 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String count = br.readLine();
		StringTokenizer timeLine = new StringTokenizer(br.readLine());
		br.close();
		int[] time = new int[Integer.parseInt(count)];
		for (int i = 0; i < time.length; i++) {
			time[i] = Integer.parseInt(timeLine.nextToken());
		}

		Arrays.sort(time);
		int sum = 0;
		int sum2 = 0;
		for (int i = 0; i < time.length; i++) {
			sum += time[i];
			sum2 += sum;

		}

		bw.write(String.valueOf(sum2));
		bw.flush();
		bw.close();

	}

}

package math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int v = Integer.parseInt(str[2]);

		//최소 하루?
		int day = 1;

		// 정상에 도착하면 미끄러지지않는다.
		// 정상에서 올라가는 만큼을 뺀 후에
		// 정확히 올라가는 높이와 맞으면 기본 나누기
		if ((v - a) % (a - b) == 0) {
			day = (v - a) / (a - b);
		// 남은 높이보다 하루에 올라가는 길이가 남으면 하루 더 추가.
		} else
			day = (v - a) / (a - b) + 1;

		bw.append(String.valueOf(day));
		bw.flush();

	}

}

package math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Beakjoon2775 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		int[][] testCase = new int[count][2];// k,n 저장

		for (int i = 0; i < testCase.length; i++) {
			//k
			testCase[i][0] = Integer.parseInt(br.readLine());
			// n
			testCase[i][1] = Integer.parseInt(br.readLine());
		}
		int[][] aprt = aprt();
		
		for (int i = 0; i < testCase.length; i++) {
			int k=testCase[i][0];
			int n=testCase[i][1];
			bw.append(aprt[k][n-1]+"\n");
		}
		bw.flush();
		
	}

	static int[][] aprt() {
		// 아파트 배열을 만들자
		int[][] aprt = new int[15][15];
		// 0층
		int num = 1;
		for (int j = 0; j < aprt[0].length; j++)
			aprt[0][j] = num++;
		// 1~14층
		for (int i = 1; i < aprt.length; i++) {
			// 모든 층에 1호는 1명 거주
			aprt[i][0] = 1;
			int n = 0;
			for (int j = 0; j < aprt[i].length; j++) {
				n += aprt[i - 1][j];
				aprt[i][j] = n;
			}
		}

		return aprt;
	}
}

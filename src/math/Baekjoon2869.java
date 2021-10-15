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

		//�ּ� �Ϸ�?
		int day = 1;

		// ���� �����ϸ� �̲��������ʴ´�.
		// ���󿡼� �ö󰡴� ��ŭ�� �� �Ŀ�
		// ��Ȯ�� �ö󰡴� ���̿� ������ �⺻ ������
		if ((v - a) % (a - b) == 0) {
			day = (v - a) / (a - b);
		// ���� ���̺��� �Ϸ翡 �ö󰡴� ���̰� ������ �Ϸ� �� �߰�.
		} else
			day = (v - a) / (a - b) + 1;

		bw.append(String.valueOf(day));
		bw.flush();

	}

}

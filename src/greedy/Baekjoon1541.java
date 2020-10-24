package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon1541 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		int sum =0;
		String first=st.nextToken();
		if (first.contains("+")) {
			String[] add = first.split("[+]");
			for (int i = 0; i < add.length; i++) {
				sum += Integer.parseInt(add[i]);
			}

		} else
            sum += Integer.parseInt(first);
		
		while (st.hasMoreElements()) {
			
			String a = st.nextToken();

			if (a.contains("+")) {
				String[] add=a.split("[+]");
				for (int i = 0; i < add.length; i++) {
					sum -= Integer.parseInt(add[i]);
				}
			} else {
				sum -= Integer.parseInt(a);
			}
		

		}
		bw.write(String.valueOf(sum));
		bw.flush();
	}
}
package sorting;

import java.io.*;
import java.util.*;

public class Baekjoon10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[] array = new int[count];
        for (int i = 0; i < count; i++)
        	array[i]=(Integer.parseInt(br.readLine()));

        Arrays.sort(array);
        for (int v : array)
            bw.append(String.valueOf(v)).append("\n");

        bw.flush();
    }
}

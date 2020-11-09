package sorting;

import java.io.*;
import java.util.*;

public class Baekjoon1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < count; i++)
            set.add(br.readLine());

        ArrayList<String> list = new ArrayList<>(set);

        list.sort((s1, s2) -> {
            if(s1.length() > s2.length())
                return 1;
            else if(s1.length() < s2.length())
                return -1;
            else
                return s1.compareTo(s2);
        });

        for (String s : list)
            bw.append(s).append("\n");

        bw.flush();
        br.close();
        bw.close();
    }
}

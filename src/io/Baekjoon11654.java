package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11654 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        char s = br.readLine().charAt(0);
//        System.out.print((int)s);

        //System.in은 바이트값으로 문자 한개만 읽으면서 아스키코드로 저장함!
        int s = System.in.read();
        System.out.print(s);
    }
}

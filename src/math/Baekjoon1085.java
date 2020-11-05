package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int x=Integer.parseInt(st.nextToken());
        int y=Integer.parseInt(st.nextToken());
        int w=Integer.parseInt(st.nextToken());
        int h=Integer.parseInt(st.nextToken());
        //경계 : 0,0 and w,h 그래서 원점과의거리인 x,y 값과 w-x, h-y 값중에 작은 값을 출력한다
       System.out.print(Math.min(Math.min(w-x,x),Math.min(h-y,y)));
    }
}

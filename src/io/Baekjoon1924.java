package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1924 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str," ");
		
		int month=Integer.parseInt(st.nextToken());
		int days=Integer.parseInt(st.nextToken());
		int totalMonth=0;
//		
//		switch(month){
//		case 12:totalMonth+=30;
//		case 11:totalMonth+=31;
//		case 10:totalMonth+=30;
//		case 9:totalMonth+=31;
//		case 8:totalMonth+=31;
//		case 7:totalMonth+=30;
//		case 6:totalMonth+=31;
//		case 5:totalMonth+=30;
//		case 4:totalMonth+=31;
//		case 3:totalMonth+=28;
//		case 2:totalMonth+=31;
//		case 1:break;
//		}
//		switch((totalMonth+days)%7) {
//		case 1:sb.append("MON");break;
//		case 2:sb.append("TUE");break;
//		case 3:sb.append("WED");break;
//		case 4:sb.append("THU");break;
//		case 5:sb.append("FRI");break;
//		case 6:sb.append("SAT");break;
//		case 0:sb.append("SUN");break;
//		}
		
		
		int[] months= {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] day= {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
	for(int i=0;i<month-1;i++) {totalMonth+=months[i];}
	totalMonth+=days;
	sb.append(day[totalMonth%7]);
		System.out.println(sb);
		
		
	}
}

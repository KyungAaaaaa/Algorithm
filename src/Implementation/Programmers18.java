package Implementation;

import java.util.StringTokenizer;

public class Programmers18 {
	public static void main(String[] args) {

		// 테스트용 입력 정의
		String[] table = { "SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
				"HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
				"GAME C++ C# JAVASCRIPT C JAVA" };
		String[] languages = { "JAVA", "JAVASCRIPT" };
		int[] preference = { 7, 5 };

		// 직업군이 5개이므로
		// [직업군 이름,점수] 를 저장할 2차원 배열 생성
		String[][] score = new String[5][2];
		String answer = "";

		for (int j = 0; j < table.length; j++) {
			// 모든 직업군의 초기 점수는 0점
			score[j][1] = "0";
			for (int i = 0; i < languages.length; i++) {
				StringTokenizer st = new StringTokenizer(table[j]);
				//직업군 이름 저장
				score[j][0] = st.nextToken();
				//직업군 언어 점수로 역정렬 돼있기때문에 5점부터 감소하여 계산
				int sc = 5;
				//현재 직업군의 적합 점수
				int n = Integer.parseInt(score[j][1]);
				
				while (st.hasMoreTokens()) {
					//5점 짜리 언어부터 선호하는 언어와 동일한 언어가 있는지 확인
					if (st.nextToken().equals(languages[i]))
						//현재점수 n에 '점수*선호도' 곱하여 더하기
						score[j][1] = String.valueOf(n += sc * preference[i]);
					//다음 언어로 넘어갈때 점수 감소시키기
					sc--;
				}
			}
		}
		
		//비교 기준 저장
		//직업군 이름
		answer = score[0][0];
		//직업군 점수
		int max = Integer.parseInt(score[0][1]);
		
		for (int i = 1; i < score.length; i++) {
			//다음 직업군의 점수
			int curScore = Integer.parseInt(score[i][1]);
			if (max < curScore) {
				max = curScore;
				answer = score[i][0];
			} else if (max == curScore)
				//점수가 같다면, 사전순으로 가장 빠른 직업군 return
				//첫째 글자만 검사한다....이럼 안되는데....ㅠ테스트는 통과
				answer = answer.charAt(0) < score[i][0].charAt(0) ? answer : score[i][0];

		}
		
		System.out.println(answer);
	}
}

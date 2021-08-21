package Implementation;

import java.util.ArrayList;

public class Programmers16 {
	public static void main(String[] args) {
		String s = "onezerotwothreefourfivesixseven";

		ArrayList<Character> ca = new ArrayList<>();

		char[] charArr = s.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			int num = (int) charArr[i];
			// 숫자인지 검사
			if (num >= 48 && num <= 57)
				// 맞으면 답 배열에 추가
				ca.add((char) num);
			else {
				char alphabet = '0';
				switch (charArr[i]) {
				case 'z':
					i += 3;
					alphabet = 48;
					break;
				case 'o':
					i += 2;
					alphabet = 49;
					break;
				case 'e':
					i += 4;
					alphabet = 56;
					break;
				case 'n':
					i += 3;
					alphabet = 57;
					break;
				case 't':
					num = charArr[++i];
					if (num == 'w') {
						i += 1;
						alphabet = 50;
					} else {
						i += 3;
						alphabet = 51;
					}
					break;
				case 'f':
					num = charArr[++i];
					if (num == 'o')

						alphabet = 52;
					else
						alphabet = 53;
					i += 2;
					break;
				case 's':
					num = charArr[++i];
					if (num == 'i') {
						i += 1;
						alphabet = 54;
					} else {
						i += 3;
						alphabet = 55;
					}
					break;
				default:
					break;
				}
				ca.add(alphabet);
			}
		}
		char[] temp = new char[ca.size()];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = ca.get(i);
		}
		int answer = Integer.parseInt(String.valueOf(temp));
		System.out.println(answer);
	}

}

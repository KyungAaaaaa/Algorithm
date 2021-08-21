package Implementation;

public class Programmers16 {
	public static void main(String[] args) {
		String s = "onezerotwothreefourfivesixseven";
		String[] number = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		for (int i = 0; i < number.length; i++)
			// 숫자 단어를 가지고 있다면
			if (s.contains(number[i]))
				// 해당 단어를 숫자로 replaceAll해준다
				// i 는 각 숫자단어의 인덱스를 가르키는데, 단어 배열과 인덱스값이 같으므로 i로 변환
				s = s.replaceAll(number[i], String.valueOf(i));

		int answer = Integer.parseInt(s);
		System.out.println(answer);
	}

}

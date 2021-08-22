package Implementation;

public class Programmers17 {
	public static void main(String[] args) {
		int[] numbers = { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 };
		String hand = "left";
		
		
		String answer="";

		String[][] keyPad = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" }, { "*", "0", "#" } };
		
		//시작 손 위치 
		int[] left = { 3, 0 };
		int[] right = { 3, 2 };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < keyPad.length; j++) {
				String curNumString = String.valueOf(numbers[i]);
				if (curNumString.equals(keyPad[j][0])) {
					// 1,4,7
					answer+="L";
					
					//왼손가락 위치저장
					left[0] = j;
					left[1] = 0;
					break;
				} else if (curNumString.equals(keyPad[j][2])) {
					// 3,6,9
					answer+="R";
					
					//오른손가락 위치저장
					right[0] = j;
					right[1] = 2;
					break;
				} else if (curNumString.equals(keyPad[j][1])) {
					// 2,5,8,0
					//왼손의 이동거리
					int l = Math.max(left[0], j) - Math.min(left[0], j) + Math.max(left[1], 1) - Math.min(left[1], 1);
					
					//오른손의 이동거리
					int r = Math.max(right[0], j) - Math.min(right[0], j) + Math.max(right[1], 1)
							- Math.min(right[1], 1);
					
					//이동거리가 짧은 손, 이동거리가 같다면 어느손잡이인지 확인 후 해당 손 이동
					String moveHand=l > r ? "R" : l == r ? (hand.equals("right") ? "R" : "L") : "L";
					answer+=moveHand;
					
					//이동후 손가락 위치 저장
					if (moveHand.equals("L")) {
						left[0] = j;
						left[1] = 1;
					} else {
						right[0] = j;
						right[1] = 1;
					}
					break;
				} else {
					continue;
				}

			}
		}

		System.out.println(answer);
	}

}

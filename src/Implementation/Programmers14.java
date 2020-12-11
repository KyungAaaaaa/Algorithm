package Implementation;

public class Programmers14 {
    public static void main(String[] args) {
        String s = "1234";
        boolean answer = true;
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) > 46 && s.charAt(i) < 58) {
                    answer = false;
                    break;
                }
            }
        } else answer = false;
        System.out.println(answer);
    }

}

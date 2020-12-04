package Implementation;

public class Programmers3 {
    public static void main(String[] args) {
        String s = "Pyy";
        int sumP = 0;
        int sumY = 0;
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == 'p' || aChar == 'P') sumP++;
            else if (aChar == 'y' || aChar == 'Y') sumY++;
        }


        if (sumP == sumY) return true;
        else return false;
    }

}

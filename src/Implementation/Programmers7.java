package Implementation;

public class Programmers7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;


        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int allDay = 0;

        for (int i = 0; i < a - 1; i++)
            allDay += day[i];


        System.out.println(days[(allDay + b) % 7]);


    }
}

package Implementation;

import java.util.Arrays;

public class Programmers8 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        int[] result = new int[arr.length];
        int index = 0;
        result[index] = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (result[index] != arr[i])
                result[++index] = arr[i];


        Arrays.stream(Arrays.copyOfRange(result, 0, ++index)).forEach(System.out::println);
    }
}

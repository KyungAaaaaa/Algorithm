package sorting;

import java.util.Arrays;

class Programmers5 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] result = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] arr = subArray(array, commands[i][0], commands[i][1]);
            Arrays.sort(arr);
            result[i] = arr[commands[i][2]-1];
        }
    }


    public static int[] subArray(int[] array, int start, int end) {
        int[] result = new int[end - start+1];
        for (int i = 0, j = start-1; j < end; i++, j++) {
            result[i] = array[j];
        }
        return result;
    }
}

package datastructure;

import java.util.ArrayList;

public class Programmers11 {
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;

        ArrayList<Integer> val = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < priorities.length; i++) {
            val.add(priorities[i]);
            index.add(i);
        }

        for (int i = 0; i < priorities.length - 1; i++) {
            for (int j = i + 1; j < priorities.length; j++) {
                if (val.get(i) < val.get(j)) {
                    val.add(val.get(i));
                    val.remove(val.get(i));
                    index.add(index.get(i));
                    index.remove(index.get(i));
                    j = i;
                }
            }
        }

        for (int i = 0; i < index.size(); i++)
            if (index.get(i) == location) System.out.println(++i);


    }
}


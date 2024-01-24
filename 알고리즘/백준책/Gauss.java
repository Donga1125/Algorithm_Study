package 알고리즘.백준책;

import java.util.HashSet;
import java.util.Set;

public class Gauss {
    static int answer;

    public static void main(String[] args) {


        int[] item = new int[99];

        int total = 5050;
        for (int i = 0; i < 100; i++) {
            answer = total - item[i];

        }

        System.out.println(answer);
    }
}

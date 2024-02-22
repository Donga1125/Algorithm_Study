package 알고리즘.단계별백준.정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 소트인사이드 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String s = sc.next();
        ArrayList<Integer> list = new ArrayList<>();
        sc.close();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i) - '0');

        }
        Collections.sort(list);
        Collections.reverse(list);

        for (int value : list) {
            sb.append(value);

        }
        System.out.println(sb);
    }
}

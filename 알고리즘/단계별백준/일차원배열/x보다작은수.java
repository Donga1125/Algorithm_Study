package 알고리즘.단계별백준.일차원배열;

import java.util.ArrayList;
import java.util.Scanner;

public class x보다작은수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];
        String answer = "";

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < x) {
                answer = answer + String.valueOf(arr[i] + " ");

            }
        }

        System.out.println(answer);

    }
}

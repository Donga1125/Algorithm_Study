package 알고리즘.단계별백준.일차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class 최소최대BF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        String answer = "";
        int max = -1000000;
        int min = 1000000;

        StringBuilder sb = new StringBuilder();



        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
            if (max <= arr[i]) {
                max = arr[i];
            }
            if (min >= arr[i]) {
                min = arr[i];
            }



        }
        System.out.println(sb.append(min).append(" ").append(max));

        sc.close();

    }
}

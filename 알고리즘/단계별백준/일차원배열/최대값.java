package 알고리즘.단계별백준.일차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class 최대값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max = 0;
        int idx = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (max <= arr[i]) {
                max = arr[i];

            }
        }
        System.out.println(max);
    }

}

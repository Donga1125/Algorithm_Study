package 알고리즘.단계별백준.일차원배열;

import java.util.Scanner;

public class 최대값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];
        int max = 0;
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (max <= arr[i]) {
                max = arr[i];
                idx = i;

            }
        }
        System.out.println(max);
        System.out.println(idx + 1);
    }

}

package 알고리즘.단계별백준.일차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class 최소최대 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println(sb.append(arr[0]).append(" ").append(arr[arr.length - 1]));

        sc.close();

    }
}

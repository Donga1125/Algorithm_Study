package 알고리즘.단계별백준.일차원배열;

import java.util.Scanner;

public class x보다작은수withSB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];
        String answer = " ";

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < x) {
                sb.append(arr[i]).append(" ");

            }
        }

        System.out.println(sb.toString().trim());

    }
}

package 알고리즘.단계별백준.일차원배열;

import java.util.Scanner;

public class 개수세기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer = 0;

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                answer++;

        }

        System.out.println(answer);

    }
}



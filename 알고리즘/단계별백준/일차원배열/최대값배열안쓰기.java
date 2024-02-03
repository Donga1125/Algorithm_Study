package 알고리즘.단계별백준.일차원배열;

import java.util.Scanner;

public class 최대값배열안쓰기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int idx = 0;

        for (int i = 1; i <= 9; i++) {
            int num = sc.nextInt();
            if (max < num) {
                max = num;
                idx = i;

            }
        }
        System.out.println(max);
        System.out.println(idx);
    }

}

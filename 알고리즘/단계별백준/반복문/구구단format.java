package 알고리즘.단계별백준.반복문;

import java.util.Scanner;

public class 구구단format {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.format("%d * %d = %d%n", n, i, n * i);
        }
    }
}

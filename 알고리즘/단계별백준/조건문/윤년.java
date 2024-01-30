package 알고리즘.단계별백준.조건문;

import java.util.Scanner;

public class 윤년 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (0 <= n) {

            if (n % 4 == 0 && n % 400 == 0) {
                System.out.println(1);
            } else if (n % 4 == 0 && n % 100 != 0) {
                System.out.println(1);

            } else
                System.out.println(0);
        }

        }
    }


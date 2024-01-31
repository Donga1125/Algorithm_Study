package 알고리즘.단계별백준.조건문;

import java.util.Scanner;

public class 주사위세개 {
    // 1부터 6까지의 주사위 세개를 던지는 경우에 따라 다른 상금을 받게 됨

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int answer = 0;


        if (a == b && b == c) {
            answer = 10000 + (b * 1000);
            System.out.println(answer);
        }
        if (a == b && b != c) {
            answer = 1000 + (b * 100);
            System.out.println(answer);

        } else if (b == c && a != c) {
            answer = 1000 + (b * 100);
            System.out.println(answer);

        } else if (a == c && b != c) {
            answer = 1000 + (c * 100);
            System.out.println(answer);
        }

        if (a != b && b != c && a != c) {
            answer = Math.max(Math.max(a, b), c) * 100;
            System.out.println(answer);
        }


    }
}

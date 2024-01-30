package 알고리즘.단계별백준.입출력과사칙연산;

import java.util.Scanner;

public class A나B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        double answer = (double) n / m;

        System.out.println(answer);
    }
}

package 알고리즘.단계별백준.입출력과사칙연산;

import java.util.Scanner;

public class 사칙연산 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int p = n + m;
        int mi = n - m;
        int multi = n * m;
        int d = n / m;
        int mo = n % m;

        System.out.println(p);
        System.out.println(mi);
        System.out.println(multi);
        System.out.println(d);
        System.out.println(mo);
    }
}

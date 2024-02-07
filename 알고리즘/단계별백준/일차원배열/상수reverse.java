package 알고리즘.단계별백준.일차원배열;

import java.util.Scanner;

public class 상수reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();

        StringBuilder sb = new StringBuilder();

        A = Integer.parseInt(sb.append(A).reverse().toString());

        sb = new StringBuilder();
        B = Integer.parseInt(sb.append(B).reverse().toString());

        System.out.print(A > B ? A : B);

    }
}

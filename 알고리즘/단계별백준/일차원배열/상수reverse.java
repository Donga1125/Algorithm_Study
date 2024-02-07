package 알고리즘.단계별백준.일차원배열;

import java.util.Scanner;

public class 상수reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();

        sc.close();

        StringBuilder sb = new StringBuilder();

         int aa = Integer.parseInt(sb.append(a).reverse().toString());

        sb = new StringBuilder();
        int bb = Integer.parseInt(sb.append(b).reverse().toString());

        System.out.print(aa > bb ? aa : bb);

    }
}

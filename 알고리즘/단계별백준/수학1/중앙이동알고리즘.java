package 알고리즘.단계별백준.수학1;

import java.util.Scanner;

public class 중앙이동알고리즘 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = 2;

//        if (n == 1) {
//            n = 9;
//        } else{
//        n = (n * n) - 1;
//        n = n * n;}

        for (int i = 0; i < n; i++) {
            d += (d - 1);
        }

        System.out.println(d * d);
    }
}

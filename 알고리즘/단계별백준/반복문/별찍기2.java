package 알고리즘.단계별백준.반복문;

import java.util.Scanner;

public class 별찍기2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");

            }

            for (int k = 0; k <= i ; k++) {
                System.out.print("*");

            }

            System.out.println();
        }
    }
}

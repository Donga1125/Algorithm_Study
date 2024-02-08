package 알고리즘.단계별백준.심화1;

import java.util.Scanner;

public class 별찍기7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = (2 * n) -1 ;

        for (int i = 1; i <= n; i++) {
            int d = i * 2 - 1;
            int s = n - i;

            for (int j = 0; j < s; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < d; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int i = n -1; i > 0; i--) {
            int d = i * 2 - 1;
            int s = n - i; // 5-4 5
            for (int j = s; s > 0 ; s--) {
                System.out.print(" ");

            }
            for (int j = d; d > 0; d--) {
                System.out.print("*");


            }
            System.out.println();
        }
            
        }
    }


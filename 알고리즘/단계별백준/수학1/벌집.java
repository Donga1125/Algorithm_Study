package 알고리즘.단계별백준.수학1;

import java.util.Scanner;

public class 벌집 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int range = 2;
        int count = 1;

        if (n == 1) {
            System.out.println(1);
        } else {

            while (range <= n) {
                range = range + (count * 6);
                count++;
            }
            System.out.println(count);
        }


    }
}

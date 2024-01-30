package 알고리즘.단계별백준.조건문;

import java.util.Scanner;

public class 사분면 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println(1);
        } else if (x > 0 && y < 0) {
            System.out.println(4);

        } else if (x < 0 && y < 0) {
            System.out.println(3);
        } else if (x < 0 && y > 0)
            System.out.println(2);
    }
}

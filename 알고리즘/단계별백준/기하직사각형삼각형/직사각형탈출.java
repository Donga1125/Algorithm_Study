package 알고리즘.단계별백준.기하직사각형삼각형;

import java.util.Scanner;

public class 직사각형탈출 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();


        int a = Math.min(w - x, (Math.abs(0 - x)));
        int b = Math.min(h - y, (Math.abs(0 - y)));

        System.out.println(Math.min(a,b));

    }
}

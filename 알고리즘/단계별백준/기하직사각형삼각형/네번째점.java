package 알고리즘.단계별백준.기하직사각형삼각형;

import java.util.Scanner;

public class 네번째점 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); int y = sc.nextInt();
        int a = sc.nextInt(); int b = sc.nextInt();
        int c = sc.nextInt(); int d = sc.nextInt();
        int answer = 0;
        int answer1 = 0;

        if (x == a) {
            answer = c;

        } else
            answer = x + a - c;

        if (y == b) {
            answer1 = d;

        } else
            answer1 = y + b - d;

        System.out.print(answer + " " + answer1);
    }
}

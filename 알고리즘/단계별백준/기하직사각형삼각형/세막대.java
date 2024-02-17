package 알고리즘.단계별백준.기하직사각형삼각형;

import java.util.Scanner;

public class 세막대 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;
        int other = 0;

        int max = Math.max(c, Math.max(a, b));
        other =  sum - max;

        if (other > max) {
            System.out.println(sum);

        } else {
        max = other - 1;
        int answer = max + other;

        System.out.println(answer);}

    }
}

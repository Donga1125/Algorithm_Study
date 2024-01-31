package 알고리즘.단계별백준.반복문;

import java.util.Scanner;

public class 합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer = 0;


        for (int i = 1; i <= n; i++) {
            answer += i;
        }

        System.out.println(answer);


    }
}

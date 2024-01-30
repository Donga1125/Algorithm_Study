package 알고리즘.단계별백준.입출력과사칙연산;

import java.util.Scanner;

public class 곱셈 {

    // 무조건 세자리만 들어온다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String answer = String.valueOf(m);

        int first;
        int second;
        int last;
        int result;

        last = n * (answer.charAt(2) - '0');
        second = n * ((answer.charAt(1) -'0'));
        first = n * ((answer.charAt(0) -'0') );
        result = n * m;

        System.out.println(last);
        System.out.println(second);
        System.out.println(first);
        System.out.println(result);

        }


    }


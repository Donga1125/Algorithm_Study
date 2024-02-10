package 알고리즘.단계별백준.심화1;

import java.util.Scanner;

public class 펠린드롬일까 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String str = sc.next(); // line의 문제 next로 받거나 아님 그 후 버퍼 비우기

        int start = 0;
        int end = str.length() - 1;
        int count = 0;

        if (str.length() == 1) {
            System.out.println(1);

        } else {


        while (start < end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
                count++;

            } else
                break;
        }
        if (count == str.length() / 2 ) {

            System.out.println(1);
        } else {
            System.out.println(0);
        }}}

        }



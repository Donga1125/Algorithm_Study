package 알고리즘.단계별백준.조건문;

import java.util.Scanner;

public class 알람시계 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int mm = 0;

        if (m >= 0) {
            if( m - 45 >= 0) {
                mm = m - 45;}
            else {
                mm = 60 - (45 - m);
            if(h - 1 < 0) {
                h = 23;
            } else {
                h = h - 1;
            }
            }

        }
        System.out.println(h + " " + mm);


    }
}

package 알고리즘.단계별백준.일차원배열;

import java.util.Scanner;

public class 상수 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n = String.valueOf(sc.nextInt());

        String m = String.valueOf(sc.nextInt());

        StringBuilder sb = new StringBuilder();

        int a = 0;

        int b = 0;


        for (int i = 0; i < n.length(); i++) {
//            n = n + String.valueOf(sb.append(n.charAt(i)));
            sb = sb.append(sb).append(n.charAt(i));
            a = Integer.parseInt(String.valueOf(sb));
        }

        StringBuilder s6 = new StringBuilder();

        for (int i = 0; i < m.length(); i++) {


//            m = m + String.valueOf(sb.append(m.charAt(i)));
            s6 = sb.append(s6).append(m.charAt(i));
            b = Integer.parseInt(String.valueOf(s6));

        }


        System.out.println(Math.max(a, b));


    }
}

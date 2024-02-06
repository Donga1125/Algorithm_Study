package 알고리즘.단계별백준.일차원배열;

import java.util.Scanner;

public class 문자열 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            StringBuilder st = new StringBuilder();
            st.append(str.charAt(0)).append(str.charAt(str.length() - 1));
            System.out.println(st);
        }
    }
}

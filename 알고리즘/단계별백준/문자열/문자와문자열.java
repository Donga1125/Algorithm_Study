package 알고리즘.단계별백준.문자열;

import java.util.Scanner;

public class 문자와문자열 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();

        System.out.println(str.charAt(n - 1));
    }
}

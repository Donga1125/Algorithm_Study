package 알고리즘.단계별백준.문자열;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 단어의개수기본 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        StringTokenizer st = new StringTokenizer(str, " ");
        System.out.println(st.countTokens());

    }}

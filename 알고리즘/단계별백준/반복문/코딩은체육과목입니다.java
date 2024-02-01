package 알고리즘.단계별백준.반복문;


import java.util.Scanner;

public class 코딩은체육과목입니다 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int bite = n / 4;

        String answer = "";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < bite; i++) {
           // answer = answer + "long ";
            answer = String.valueOf(sb.append("long "));

        }
        answer = String.valueOf(sb.append("int"));
        System.out.println(answer);

    }
}

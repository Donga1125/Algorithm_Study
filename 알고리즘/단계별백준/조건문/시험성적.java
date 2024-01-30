package 알고리즘.단계별백준.조건문;



import java.util.Scanner;

public class 시험성적 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 100) {
            if (90 <= n) {
                System.out.println('A');
            } else if (80 <= n && n <= 89) {
                System.out.println('B');
            } else if (70 <= n && n <= 79) {
                System.out.println('C');
            } else if (60 <= n && n <= 69) {
                System.out.println('D');
            } else
                System.out.println('F');}

    }
}


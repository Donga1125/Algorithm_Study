package 알고리즘.단계별백준.브루트포스;

import java.util.Scanner;

public class 분해합 {
    //자리 수마다 다르다

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;



        for (int i = 0; i < n; i++) {
            String str = String.valueOf(i);
            int check = 0;
            for (int j = 0; j < str.length(); j++) {
                check = check + (str.charAt(j) -'0');
                }

            if (i + check == n) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
    }


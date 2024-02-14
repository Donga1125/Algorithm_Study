package 알고리즘.단계별백준.수학1;

import java.util.Scanner;

public class 달팽이는올라가고싶다 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();

        int answer = 0;

        int count = 0;

        while (answer <= v) {

            answer = answer + a; // 0 + 2
            if (answer == v) {
                count++;
                break;
            }
            answer = answer - b; // 2 -1
            count++; //
        }

        System.out.println(count);
    }


}

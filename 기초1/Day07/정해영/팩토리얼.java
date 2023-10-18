package 기초1.Day07.정해영;

import java.util.Scanner;

public class 팩토리얼 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 1;

        if(n == 0) {
            System.out.println(1);
            sc.close();
            return;
        }

        for(int i=n; i>=2; i--){
            result *= i;
        }

        System.out.println(result);
    }
}

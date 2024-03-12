package 알고리즘.단계별백준2.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팩토리얼2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());
        System.out.println(factorial(n));

    }

    public static long factorial(long a) {

        if (a == 1 || a == 0) {

            return 1;
        } else
            return a * factorial(a - 1);


    }
}

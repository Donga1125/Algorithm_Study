package 알고리즘.단계별백준2.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 파보나치수5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        System.out.println(fibo(t));

    }

    public static long fibo(int t) {

        if (t == 0) {
            return 0;
        }
        if (t == 1 || t == 2) {
            return 1;
        }

        return fibo(t - 1) + fibo(t - 2);

    }
}

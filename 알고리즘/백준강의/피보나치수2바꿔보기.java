package 알고리즘.백준강의;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 피보나치수2바꿔보기 {

    static long[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new long[n + 1];
        Arrays.fill(arr, -1);

        fib(n);
        System.out.println(fib(n));






    }

    private static long fib(int n) {

        arr[0] = 0;

        arr[1] = 1;
        arr[2] = 1;

        if (arr[n] == -1) {
            arr[n] = fib(n-1) + fib(n-2);
        }

        return arr[n];

    }


}

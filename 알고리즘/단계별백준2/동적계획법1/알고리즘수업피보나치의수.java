package 알고리즘.단계별백준2.동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘수업피보나치의수 {

    private static int fiboC = 0;
    private static int fibo = 0;
    private static int[] arr;

    // 24416

    //피보나치를 구하는데 dp 쓰냐 안쓰냐의 차이 구하자

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        arr = new int[n + 1];

        fibo(n);
        fiboWithDp(n);
        sb.append(fiboC).append(" ").append(fibo);

        System.out.println(sb);



    }

    private static int fibo(int n) {
        if (n == 1 || n == 2) {
            fiboC++;
            return 1;


        }


        return fibo(n - 1) + fibo(n - 2);
    }

    public static int fiboWithDp(int n) {
        arr[1] = arr[2] = 1;

        for (int i = 3; i <= n; i++) {
            fibo++;

            arr[i] = arr[i - 1] + arr[i - 2];

        }
        return arr[n];






    }
}

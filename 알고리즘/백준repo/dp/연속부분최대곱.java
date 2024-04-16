package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 연속부분최대곱 {

    //2670

    //연속된 값을 n-1에 dp로 저장한 상태라면 n-1과 현재 수를 비교해서 더 큰 수를 저장해서 반환
    //f(n) = max(n-1, n * dp[n]) // 현재 수와 이때까지 dp에 저장된 수 곱하기 현재수의 크기를 비교해서max에 저장하자

    private static double arr[];
    private static double dp[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        arr = new double[t+1];
        dp = new double[t +1];

        double max = 0;

        for (int i = 1; i <= t; i++) {
            arr[i] = Double.parseDouble(br.readLine());
            dp[i] = Math.max(arr[i], dp[i - 1] * arr[i]); // 0곱이라 헷갈렸는데 어차피 arr[i]로 저장되니 ㄱㅊ
            max = Math.max(max, dp[i]);
        }
        System.out.println(String.format("%.3f",max)); // 소수점3번째 자리를 출력하는 스트링포맷




    }



}

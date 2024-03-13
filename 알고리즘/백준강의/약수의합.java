package 알고리즘.백준강의;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 약수의합 {
    // 시간초과로 o(n)으론 풀 수 없다
    // 7이 들어온다면 res + i ( n /i) 공식을 외우고 있어야 한다! 내 머리로 생각하려면 개오래걸리고 어려워 죽는다
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        long res = 0;

        for (int i = 1; i <= t; i++) {
            res = res + i * (t / i);

        }

        System.out.println(res);
            
    }
}

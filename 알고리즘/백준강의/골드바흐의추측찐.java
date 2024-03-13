package 알고리즘.백준강의;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 골드바흐의추측찐 {
    //6588

    ///4 보다 큰 수는 두 홀수의 합으로 나타낼 수 있고 그 중 가장 큰 홀수의 합을 출력해내라


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        boolean[] isPrime = new boolean[1000001];
        isPrime[0] = true; // 소수를 false로 함
        isPrime[1] = true;
        // 처음엔 다 prime(false)으로 세팅
        // 배수는 prime이 아니므로 true
        for (int i = 2; i <= Math.sqrt(1000000); i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j < 1000000; j = j + i) {
                    isPrime[j] = true;
                }
            }
        }

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            boolean ans = false;
            for (int i = 2; i <= n / 2; i++) { // 범위는  i + n -i가 n이 되어야 하니까 반까지만 판별
                if (!isPrime[i] && !isPrime[n - i]) { // 앞에 수가 작으면 뒷 수는 크기에 먼저 나온 앞 소수로 제출이 답
                    System.out.println(n + " = " + i + " + " + (n - i));
                    ans = true;
                    break;
                }
            }
            if (ans == false) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }





}

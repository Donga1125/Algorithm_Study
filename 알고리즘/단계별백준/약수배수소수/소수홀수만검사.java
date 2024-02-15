package 알고리즘.단계별백준.약수배수소수;

import java.util.ArrayList;
import java.util.Scanner;

public class 소수홀수만검사 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> primes = findPrimes(n, m);

        if (primes.isEmpty()) {
            System.out.println(-1);
        } else {
            int sum = 0;
            for (int prime : primes) {
                sum += prime;
            }
            System.out.println(sum);
            System.out.println(primes.get(0));
        }
    }

    public static ArrayList<Integer> findPrimes(int n, int m) {
        ArrayList<Integer> primes = new ArrayList<>();



            for (int num = Math.max(2,n); num <= m; num++) { //2랑 n중에 큰 수를 num값으로 가진다 1이면 2?

                boolean isPrime = true;

                 // 짝수일 경우, 2를 제외한 다른 짝수는 소수가 아님
                if (num % 2 == 0) {
                     isPrime = false;
                } else {
                // 홀수에 대해서만 검사
                    for (int i = 3; i * i <= num; i += 2) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                primes.add(num);
            }
        }

        return primes;
    }
}

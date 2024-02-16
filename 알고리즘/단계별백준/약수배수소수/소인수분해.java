package 알고리즘.단계별백준.약수배수소수;

import java.util.ArrayList;
import java.util.Scanner;

public class 소인수분해 {

    // n이 1일 경우 아무 것도 출력하지 않는다.

    //횟수로 소인수 분해 소수들 판별 후 그 수들로 나눠주기 안 나눠진다면 다음 수를 선택
    // 남은 수가 소수라면 끝

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        ArrayList<Integer> primes = eratosthenes(n);
        int idx = 0;

        if (n == 1) {

        } else // 배열이 넘어오고 그 배열의 수를 차례대로 나눴을 떄 나머지가 없는 값이 있으면 또 처음부터 나누기
        // 동작은 n이 arr.의 수 중 하나가 됐을 때 ?

            while (n > 1) {
                if(idx <= primes.size() -1) {
                    if (n % primes.get(idx) == 0) {
                        n = n / primes.get(idx);
                        System.out.println(primes.get(idx));
                     } else {
                        idx++;}
                } else
                    break;
            }


    }

    public static ArrayList<Integer> eratosthenes(int n) { // 그냥 체로 거르고 그 수 저장 ?? 그 수 만큼만
        boolean[] isPrime = new boolean[n + 1];
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }

            }
        }
        for (int i = 0; i <= n; i++) {
            if (isPrime[i]) {
                arr.add(i);
            }

        }
        return arr;
    }
}

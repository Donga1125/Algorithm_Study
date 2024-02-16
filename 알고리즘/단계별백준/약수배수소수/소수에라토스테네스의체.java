package 알고리즘.단계별백준.약수배수소수;

import java.util.ArrayList;
import java.util.Scanner;

public class 소수에라토스테네스의체 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> primes = eratosthenes(n, m);

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

    public static ArrayList<Integer> eratosthenes(int n, int m) {
        boolean[] isPrime = new boolean[m + 1];
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= m; i++) { // 2부터 다 트루로 만들어줘서 일단 다 소수로 생각
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= m; p++) {// 그 이후 2부터 시작해서 그 수가 소수라면 그에 대한 배수들을 다 소수가 아니라고판단해줌(2,4,6,)
            if (isPrime[p]) { // 그러면 2,3, (4부터는 2에서 걸렀음) 이렇게 소수라면 거기에 대한 배수를 false로 바꿔주는 작업
                for (int i = p * p; i <= m; i = i + p) { // 이런 식으로~
                    isPrime[i] = false;
                }
            }
        }

        for (int i = n; i <= m; i++) { // 어차피 들어오는 수는 2보다 작을 수 없고 2보다 작다면 false가 이미 찍혀있음)math.max(2,n) 비교
            // 할 필요 xx
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
}

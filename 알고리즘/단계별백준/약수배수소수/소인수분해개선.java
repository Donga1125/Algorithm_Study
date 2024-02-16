package 알고리즘.단계별백준.약수배수소수;

import java.util.ArrayList;
import java.util.Scanner;

public class 소인수분해개선 {
    // 소수 리스트 저장하고 그 수들로만 나눠야 한다고 생각해서느렸다 어차피 소인수분해는 다른수로 못나눔;;


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.close();

            ArrayList<Integer> primeFactors = primeFactorization(n);

            for (int factor : primeFactors) {
                System.out.println(factor);
            }
        }

        public static ArrayList<Integer> primeFactorization(int n) {
            ArrayList<Integer> primeFactors = new ArrayList<>();

            // 2부터 시작하여 n의 제곱근까지만 소수를 확인
            for (int factor = 2; factor * factor <= n; factor++) {
                while (n % factor == 0) { // 현재 소수로 나누어 떨어지는지 확인
                    primeFactors.add(factor); // 소수로 나누어 떨어진다면 소인수 리스트에 추가
                    n /= factor; // n을 현재 소수로 나눈 몫으로 갱신
                }
            }

            // 남은 수가 1이 아닌 경우에는 자신도 소인수이므로 추가
            if (n > 1) {
                primeFactors.add(n);
            }

            return primeFactors;
        }
    }


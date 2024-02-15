package 알고리즘.단계별백준.약수배수소수;

import java.util.ArrayList;
import java.util.Scanner;

public class 소수 {

    // 범위 m n 이 주어지고, 그 범위 사이에서 소수를 찾고 소수 합과 소수 중 가장 작은 수를 리턴
    // 그럼 루프는 mn을 돌면서 찾음 되겠따

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;


        while (n <= m) {

            boolean isPrime = true;

            if (n < 2) {
                isPrime = false; // 2보다 작은 수 들어올 경우 생각 안했네
            } else {
                for (int i = 2; i <= Math.sqrt(n); i++) { // 제곱근까지 돌아야하고,
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime == true) {
                arr.add(n);
                sum = sum + n;
            }
        }

        if (arr.isEmpty()) {
            System.out.println(-1);

        } else
            System.out.println(sum);
            System.out.println(arr.get(0));
    }
}

package 알고리즘.백준강의;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 골드바흐의추측 {
    //6588

    ///4 보다 큰 수는 두 홀수의 합으로 나타낼 수 있고 그 중 가장 큰 홀수의 합을 출력해내라
    public static int max = Integer.MIN_VALUE;
    public static boolean[] isPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


            while (true) {
                int t = Integer.parseInt(br.readLine());
                if (t == 0) {
                    break;
                }
                if (max < t) {
                    max = t;
                }
                eras();
                boolean ans = false;
                for (int i = 2; i <= t / 2; i++) {
                    if (isPrime[i] && isPrime[t - i]) {
                        System.out.println(t + " = " + i + " + " + (t - i));
                        ans = true;
                        break;
                    }
                }
                if (ans == false) {
                    System.out.println("Goldbach's conjecture is wrong.");
                }
            }
        }





    public static void eras() {

        isPrime = new boolean[max + 1];

        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i <= Math.sqrt(max); i++) {

            if (!isPrime[i]) {

                for (int j = i * i; j <= max; j = j + i) {
                    isPrime[j] = true;
                }
            }

        }

    }





}

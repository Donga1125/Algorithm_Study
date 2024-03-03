package 알고리즘.단계별백준.약수배수소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 다음소수 {

    // 수가 주어지면 그 다음으로 젤 큰 소수를 찾아서 반환
    // 0이랑 1도 들어와짐

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine());
            while (true) {
                boolean isPrime = false; // 현재 소수 판별
                for (int j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) { // 입력받은 수가 소수가 아니라면 바로 true로 탈출
                        isPrime = true;
                        break;
                    }
                }

                if (!isPrime) {
                    if (n == 0 || n == 1) { // 0이랑 1도 들어오니까 들어오면 그냥 2로 바꿔주고 반환
                        n = 2;
                    }

                    System.out.println(n);
                    break;
                }
                n++;
            }

        }
    }
}

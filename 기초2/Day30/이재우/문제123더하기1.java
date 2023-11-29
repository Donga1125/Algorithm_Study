package 기초2.Day30.이재우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문제123더하기1 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //A[N] 은 정수 N을 1,2,3의 합으로 나타내는 모든 방법의 수 일 때
        //A[N] = A[N - 1] + A[N - 2] + A[N - 3] 이 성립한다

        int T = Integer.parseInt(br.readLine());
        int[] A = new int[11];
        int N;

        for(int i = 0 ; i < T ; i++) {
            N = Integer.parseInt(br.readLine());

            A[0] = 1;
            A[1] = 1;
            A[2] = 2;

            for(int j = 3 ; j <= N ; j++) {
                A[j] = A[j - 1] + A[j - 2] + A[j - 3];
            }

            System.out.println(A[N]);
        }
    }
}

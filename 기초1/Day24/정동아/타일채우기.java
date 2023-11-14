package 기초1.Day24.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 타일채우기 {

    private static int N;
    private static int [] cache;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        // 채우려는 타일의 크기가 2의 배수이므로, N이 짝수 크기인 경우만 완전히 채울 수 있다.
        cache = new int[N +1];
        if (N %2 ==0){
            cache[0] = 1;
            cache[2] = 3;

            for (int i =4; i<= N; i+= 2){
                cache[i] = cache[i-2] * cache[2];

                for (int j = i-4; j>=0; j-=2){
                    cache[i] += (cache[j] *2);
                }
            }
        }

        System.out.println(N%2 ==0 ? cache[N] :0);
    }
}

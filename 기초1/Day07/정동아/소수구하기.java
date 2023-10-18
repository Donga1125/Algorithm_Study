package 기초1.Day07.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken()); //3
        int n = Integer.parseInt(st.nextToken()); //16

        boolean[]prime = new boolean[n+1];

        for (int i = 2; i<=n; i++){ // 2~ 16
            if (prime[i]){ //소수가 아닌것들 지나감
                continue;
            }
            if (i>=m){ //i가 3보다 크고, false이면 출력 (소수인거)
                sb.append(i).append('\n');
            }
            for (int j = i+i; j<=n; j+=i){ // 4~ 16,
                prime[j] = true;
            }
        }

        System.out.println(sb);
    }
}

package 기초1.Day14.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 카드구매하기 {
    // D[i] = P[n] + D[i-n]
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [] p = new int[n+1];
        int [] d = new int[n+1];
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input);
        for (int i = 1; i<=n; i++){
            p[i] = Integer.parseInt(st.nextToken());
        }

        for (int i =1; i<=n; i++){
            for(int j=1; j<=i; j++){
                d[i] = Math.max(d[i], d[i-j]+p[j]);
            }
        }

        System.out.println(d[n]);

    }
}

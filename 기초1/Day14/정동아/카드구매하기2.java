package 기초1.Day14.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 카드구매하기2 {
    //카드 N개를 구매하는데 최소 비용
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
        // 카드 1개부터 N개까지. ( Bottom-Up 방식 )
        for(int i = 1; i <= n; i++){
            d[i] = p[i]; // 최소값 초기화.
            // d[i] = -1;
            for(int j = 1; j <= i; j++){
                d[i] = Math.min(d[i], d[i-j]+p[j]);
                // if (d[i] == -1 || d[i] > d[i-j] + a[j]) {
                //     d[i] = d[i-j] + a[j];
                // }
            }
        }

        System.out.println(d[n]);

    }
}

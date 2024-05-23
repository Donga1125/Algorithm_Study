package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평범한배낭 {
    //배낭 주석

    // 배낭의  물품 수 1<= n <=100 과 최대 무게 1<= k <= 100,000 주어지고,
    // 무게 w(1~100,000) 가치 v(0~1,000)이 주어질 때 들 수 있는 최대 가치 합을 출력
    static int[][] arr;
    static int k;
    //12865
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[n][2 + 1];


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= 2; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

            }


        }

        System.out.println();


    }
}

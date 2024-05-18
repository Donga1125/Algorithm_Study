package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평범한배낭 {
    //배낭 주석
    static int[][] arr;
    //12865
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(br.readLine());
        arr = new int[b][2 + 1];


        for (int i = 0; i < b; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= 2; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

            }


        }

        System.out.println();


    }
}

package 알고리즘.단계별백준.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 공바꾸기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        int answer[] = new int[n];

        for (int i = 1; i <= n; i++) {

            answer[i - 1] = i;

        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1; // 1
            int end = Integer.parseInt(st.nextToken()) - 1; // 2

            int save = answer[start];
            answer[start] = answer[end];
            answer[end] = save;

        }

        for (int values : answer) {
            System.out.print(values + " ");
        }

        br.close();

    }
}

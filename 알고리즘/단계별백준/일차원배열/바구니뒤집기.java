package 알고리즘.단계별백준.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 바구니뒤집기 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int[] answer = new int[n];

        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
            answer[i - 1] = i;
        }


        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int range = end - start;

            for (int j = 0; j <= range; j++) {

                answer[(start - 1) + j] = arr[(end-1) -j];

            }
            System.arraycopy(answer, 0, arr, 0, n);

            }

        for (int values : answer) {
            System.out.print(values + " ");

        }
        }

    }



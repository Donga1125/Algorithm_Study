package 알고리즘.단계별백준.일차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 공넣기 {
    // 들어온 값들을 계속 교체해주면 되는거

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        String answer = "";

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;
            int idx = Integer.parseInt(st.nextToken());
            for (; start <= end ; start++) {
                arr[start] = idx;

            }
        }
        answer = Arrays.toString(arr);
        answer = answer.substring(1, answer.length() - 1);
        answer = answer.replace(",", "");
        System.out.println(answer);


    }
}

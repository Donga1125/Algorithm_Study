package 알고리즘.doit.구간의합;

//문제
//수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.

//입력
//첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다.
// 수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.

//출력
//총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.

// 첫째 줄엔 2번째 배열의 수와 몇번 ixj해야 하는지의 수 2개가 들어오고 그다음 부턴 차례대로 100,000 x 100,000이니까 1억 1초임

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// 이런 배열이 들어오면, 먼저 합배열을 미리 만드는 게 좋다 (메모리를 써서 시간을 줄이자!)

public class 구간의합4백준11659 {

    // 합배열!!!!

    static int N;
    static int M;

    static int answer;



    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        long[] arr = new long[N +1]; //0 5 4 3 2 1
        long[] sum = new long[N +1]; //0 5 9 12 14 15
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum[i] = sum[i - 1] + arr[i];
        }



        for (int i = 0; i < M; i++) { // 1, 3   2,4   5,5
            answer = 0;
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            answer = (int)(sum[end] - sum[start -1]);

            System.out.println(answer);

        }
    }
}

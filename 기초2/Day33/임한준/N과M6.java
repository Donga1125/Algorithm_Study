package 기초2.Day33.임한준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N과M6 {

    /**
     * 15654
     * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
     * 1 초	512 MB	32633	23907	19211	72.772%
     * 문제
     * N개의 자연수와 자연수 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오. N개의 자연수는 모두 다른 수이다.
     * <p>
     * N개의 자연수 중에서 M개를 고른 수열
     * 입력
     * 첫째 줄에 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
     * <p>
     * 둘째 줄에 N개의 수가 주어진다. 입력으로 주어지는 수는 10,000보다 작거나 같은 자연수이다.
     * <p>
     * 출력
     * 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
     * <p>
     * 수열은 사전 순으로 증가하는 순서로 출력해야 한다.
     */

    static int n, m;
    static int arr[];
    static int ans[];

    static boolean visited[];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        ans = new int[n];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }
        Arrays.sort(arr);
        dfs(0);
        System.out.println(sb.toString());


    }

    public static void dfs(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(ans[i] + " ");}
                sb.append("\n");
            return;
            }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                if (depth == 0 || (depth > 0 && arr[i] > ans[depth - 1])) {
                    // 처음 선택 시 and 현재 숫자가 이전 숫자보다 클 때

                visited[i] = true;
                ans[depth] = arr[i];
                dfs(depth + 1);
                ans[depth] = 0; // 선택 수 초기화 다시 쓰기
                visited[i] = false;
            }
            }
        }
    }
}


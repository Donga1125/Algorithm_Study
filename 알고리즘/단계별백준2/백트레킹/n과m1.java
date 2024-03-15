package 알고리즘.단계별백준2.백트레킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n과m1 {

    //벡트래킹 문제 (dfs로 구현이지만 dfs처럼 완전 탐색하지 않고 한정조건에 의해 그건 제외하고 풀기
    // 여기선 아마 중복되는 수열 즉 같은 수는 나오면 안됨

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 총 수
        int m = Integer.parseInt(st.nextToken());
        boolean[] visited = new boolean[n + 1];
        int arr[] = new int[m];
        int depth = 0;

        backtracking(arr, visited, n, m, depth);

    }

    public static void backtracking(int[] arr, boolean[] visited, int n, int m, int depth) {

        // 수열의 길이가 m까지 온다 출력하고 종료하자!

        if (depth == m) {
            for (int i : arr) {
                System.out.print(i + " ");

            }
            System.out.println();
            return;
        }


        for (int i = 1; i <= n; i++) {
            // 현재 숫자보다 큰 숫자에서 false인 수를 선택
            if (!visited[i]) {

                arr[depth] = i;
                visited[i] = true;
                backtracking(arr, visited, n, m, depth + 1);
                visited[i] = false;
            }
        }

    }


}

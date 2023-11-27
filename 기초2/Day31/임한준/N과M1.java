package 기초2.Day31.임한준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M1 {

    /**
     문제
     자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

     1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
     입력
     첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)

     출력
     한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.

     수열은 사전 순으로 증가하는 순서로 출력해야 한다.
     */
    // 들어오는 수

    public static int n, m;
    public static StringBuilder sb = new StringBuilder();
    public static int arr[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[m];

        dfs(1, 0);
        System.out.println(sb);



    }

    public static void dfs(int depth, int a) {

        if (depth == m) {
            for(int t : arr) {
                //if(t==0) break;
                sb.append(t).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = a; i <= n ; i++) { //1-4까지
            arr[depth] = i;
            arr[a] = i;
            dfs(depth +1, i + 1); // 1,2,3,4가 담기고 다음 2부터 나오게 하기 위해

        }

    }
}

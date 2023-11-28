package 기초2.Day31.임한준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M2{

    /** 문제 15650
     자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

     1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
     고른 수열은 오름차순이어야 한다.
     입력
     첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)

     출력
     한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.

     수열은 사전 순으로 증가하는 순서로 출력해야 한다.
     */

    //  기존의 DEPTH만 있는 게 아니라 AT라는 현재 위치도 받아야한다
    // 중복방문인지를 고려할 필요가 없으므로 boolean 배열로 중복 여부를 체크할 필요 또한 없다
    public static int[] arr;
    public static int N, M;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        dfs(1, 0);
        System.out.println(sb);

    }

    public static void dfs(int at, int depth)  {// 기존의 DEPTH만 있는 게 아니라 AT라는 현재 위치도 받아야한다

        if (depth == M) { // 깊이가 M이랑 같을 경우
            for (int t : arr) {
                sb.append(t).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = at; i <= N; i++) {
            //현재 깊이를 i 로 하여 해당 위치에 i 값을 담기

            arr[depth] = i;
            dfs(i + 1, depth + 1);
            //현재 i 값보다 다음 재귀에서 더 커야함
            //i + 1 의 값을 넘겨주고, 깊이 또한 1 증가시켜 재귀호출!

        }
    }

}


package 기초2.Day31.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M_1 {
    //1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
    //수열은 사전 순으로 증가하는 순서로 출력

    public static int [] arr;
    public static boolean [] visit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit = new boolean[N];
        dfs(N,M,0);

        System.out.println(sb);

    }

    public static void dfs (int N, int M, int depth){
        if (depth == M){
            for (int val : arr){
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i =0; i<N; i++){
            if (!visit[i]){
                visit[i] = true;
                arr[depth] = i+1;
                dfs(N,M,depth+1);
                visit[i] = false;
            }
        }
    }
}

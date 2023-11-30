package 기초2.Day33.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N과M_6 {
    //N개의 자연수 중에서 M개를 고른 수열
    //고른 수열은 오름차순이어야 한다.

    public static int [] arr;
    public static int N,M;
    public static boolean [] visit;
    public static int [] ans;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        ans = new int[M];
        visit = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i =0; i<N; i++){ //두번째로 입력받은 수열을 배열에 넣어줌
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); //배열에 들어간 수 오름차순으로 정렬

        dfs(0,0);

        System.out.println(sb);

    }

    public static void dfs (int at,int depth){
        if (depth == M){
            for (int val : ans){
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i =at; i<N; i++){
            if (!visit[i]){
                visit[i] = true;
                ans[depth] = arr[i];
                dfs(i+1,depth+1);
                visit[i] = false;
            }
        }
    }

}

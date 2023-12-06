package 기초2.Day36.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N과M_11 {
    //N개의 자연수 중에서 M개를 고른 수열
    //같은 수를 여러 번 골라도 된다.
    //중복되는 수열 출력 X
    //모든 경우의 수 탐색 -> 방문 체크 필요 없음
    public static int [] arr;
    public static int N,M;
    public static int [] ans;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        ans = new int[M];


        st = new StringTokenizer(br.readLine());
        for (int i =0; i<N; i++){ //두번째로 입력받은 수열을 배열에 넣어줌
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); //배열에 들어간 수 오름차순으로 정렬

        dfs(0);

        System.out.println(sb);

    }

    public static void dfs (int depth){
        if (depth == M){
            for (int val : ans){
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        int past = 0;
        for (int i = 0; i< N; i++){ //중복허용하기 위해
            if (past != arr[i]){
                ans[depth] = arr[i];
                past = arr[i];
                dfs(depth+1);
            }
        }
    }
}



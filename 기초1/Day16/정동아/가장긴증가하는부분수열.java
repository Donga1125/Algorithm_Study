package 기초1.Day16.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장긴증가하는부분수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int [] seq = new int[N]; //입력받은 수열이 들어갈 배열
        int [] dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i<N; i++){ //입력받은 수열을 배열에 넣어줌
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for (int i =0; i<N; i++){
            dp[i] =1;

            //0~i 이전 원소들을 탐색
            for (int j =0; j<i; j++){
                //j번째 원소가 i번째 원소보다 작으면서, i번째 dp가 j번째 dp+1 값보다 작을경우
                if(seq[j]<seq[i] && dp[i]<dp[j]+1){
                    dp[i] = dp[j] +1; //j번째 원소의 +1값이 i번째 dp가 된다
                }
            }
        }

        // 최댓값(최대 길이) 탐색
        int max = 1;
        for(int i = 0; i < N; i++) {
            max = dp[i] > max ? dp[i] : max;
        }
        System.out.println(max);


    }
}

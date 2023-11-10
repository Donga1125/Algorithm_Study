package 기초1.Day21.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 포도주시식 {
    //최대로 마실 수 있는 포도주의 양을 출력
    /**
     * 포도주 잔을 선택하면 그 잔에 들어있는 포도주는 모두 마셔야 하고, 마신 후에는 원래 위치에 다시 놓아야 한다.
     * 연속으로 놓여 있는 3잔을 모두 마실 수는 없다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N+1];
        int [] dp = new int[N+1];

        for (int i =1; i<=N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = arr[1];
        if(N>1){
            dp[2] = arr[1] + arr[2]; //이전잔들을 선택 한 최대 합
        } //dp[1], dp[2] 초기화
        for (int i =3; i<=N; i++){ //dp[i-3]에서 인덱스 참조가 벗어날 수 있기때문에 3부터 시작
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-2]+arr[i], dp[i-3] + arr[i-1]+ arr[i]));
        }
        System.out.println(dp[N]);
    }

}

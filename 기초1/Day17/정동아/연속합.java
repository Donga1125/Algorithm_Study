package 기초1.Day17.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연속합 {
    //n개의 정수로 이루어진 임의의 수열이 주어진다.
    // 이 중 연속된 몇 개의 수를 선택해서 구할 수 있는 합 중 가장 큰 합을 출력
    //수는 한개 이상 선택해야한다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());  //ex_10
        int [] arr = new int[N]; //입력받은 수열이 들어갈 배열
        int [] dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i<N; i++){ //입력받은 수열을 배열에 넣어줌
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //ex_ arr = {2 1 -4 3 4 -4 6 5 -5 1}

        dp[0] = arr[0]; //이전에 탐색할게 없어서 배열 첫번째 값이 되므로 [0] 값으로 초기화
        int max = arr[0]; //ex_ dp[0] = 2, max = 2

        for (int i =1; i<N; i++){
            //(이전dp+ 현재arr값) 과 현재arr값 중에서 더 큰거를 dp에 저장
            dp[i] = Math.max(dp[i-1]+arr[i], arr[i]); //ex_ (2+1)이랑 1이랑 비교. dp[1]은 3이됨

            //최대값 갱신
            max= Math.max(max, dp[i]); //ex_ max = 초기 2값이랑 3이랑 비교해서 3이됨
        }

        System.out.println(max);

    }
}

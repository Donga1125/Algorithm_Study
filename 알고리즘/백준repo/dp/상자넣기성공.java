package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 상자넣기성공 {
    // 쭉 나열된 상자들이 있는데 앞 상자가 뒤에 상자보다 더 작다면 뒤 상자에 넣을 수 있다 (건너뛰기 가능)
    // 1, 5, 2, 3, 7 가 있다면 1을 5에 넣고 -> 다시 7에 넣으면 3번 넣게 된다
    // 근데 1 2 3 7 순으로 넣게 된다면 4번 넣을 수 있다 최대로 넣는 횟수를 구해라

    //LIS 최장 증가 부분 수열 문제래 ㅠㅠ


    // 상자는 1000개 까지 낳옴
    private static int[] box;
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        box = new int[t];
        dp = new int[t];
        int answer = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < t; i++) {
            box[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }

        for (int i = 0; i <t ; i++) {// 현재 i까지 오는데, 올 수 있는 가장 큰수를 저장한다

            for (int j = 0; j < i ; j++) { // 0부터 i까지 돌면서 즉 j-3,j-2,j-1 이렇게 다 비교해서 그 수를 i 값에 저장
                if(box[i] > box[j] ){

                    dp[i] = Math.max(dp[i], dp[j] + 1); // 크다면 이거 없어도 dp[j]+1 해주는 거 아닌가 ?
                    // 현재 수와 전 수들만 비교해서 넣기에
                    // 현재 dp[i]에 저장된 가장 긴 수와 변화한 J+1수를 비교해서 큰 값을 계속 저장 더 큰게 있다면 dp[j]+1
                    //해주고 아니라면 그냥 dp[i]에 저장된 거 그대로 사용

                }
            }
            answer = Math.max(answer, dp[i]);
        }

        System.out.println(answer);
        }






//        for (int i = 1; i <=t ; i++) { // 최장 증가하는 수열이래
//            for (int j = i; j <=t ; j++) {
//                // dp[i] 가 담았을 때 맥스되게 하면 될듯
//                // 가정이 다음 수가 더 클때만 가능한데, 그 수를 담거나 안 담거나 했을 때 맥스가 되게
//                if(box[i] < box[j] ){
//                    dp[i] = dp[i] + dp[j] + 1;}
//
//            }
        }


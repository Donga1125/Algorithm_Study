package 알고리즘.백준책.백준강의커리큘럼.브루트포스.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장긴증가하는수열bottomup {

    //11053
    private static int t;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[t];
        int[] dp = new int[t];



        for (int i = 0; i < t; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
           
        }

        for (int i = 0; i < t; i++) {
            dp[i] = 1;

            // j번째 원소가 i번째 원소보다 작으면서 i번째 dp가 j번째 dp+1 값보다 작은경우

            for (int j = 0; j < t; j++) {
                if (arr[j] < arr[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1; // j번째 원소의 +1 값이 i번째 dp가 된다.
                }
            }
        }

        // 최댓값(최대 길이) 탐색
        int max = -1;
        for(int i = 0; i < t; i++) {
            max = dp[i] > max ? dp[i] : max;
        }
        System.out.println(max);

    }



    }


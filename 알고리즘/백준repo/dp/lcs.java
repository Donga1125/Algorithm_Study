package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lcs {
    // LCS(Longest Common Subsequence, 최장 공통 부분 수열)문제는 두 수열이 주어졌을 때,
    // 모두의 부분 수열이 되는 수열 중 가장 긴 것을 찾는 문제이다.

    //예를 들어, ACAYKP와 CAPCAK의 LCS는 ACAK가 된다. lis같은 느낌인데, 두 수열의 공통된 가장 긴 부분
    private static int[] dp;
    private static char[] f;
    private static char[] s;
    private static char[] sd;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String first = br.readLine(); // 따로 잘라서 넣을 수 있는 걸로 아는데 찾아보자
        String second = br.readLine();


        f = new char[first.length()];
        s = new char[second.length()];

        for (int i = 0; i < f.length; i++) {
            f[i] = first.charAt(i);
            s[i] = second.charAt(i);


        }
        // 일치하는 수면 dp[i]와 dp[j]수가 일치 하는 지도 확인 후 계속 추가해서 더 큰 값을 저장 ?
        // 원래 lis는 증가가 기준인데 이건 기준을 다른 수열과 같은 지를 비교해서 같다면 추가의 형식


        for (int i = 0; i < f.length; i++) {
            dp[1] = 1;

            for (int j = 0; j < i; j++) {
//                if(f[i]) // 현재 배열의 수 f 배열 안ㅇ ㅔ있으면서 s 배열의 수도 안에 있어야 만족
                    //

            }
        }





    }
}

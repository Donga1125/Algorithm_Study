package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lcs {
    // LCS(Longest Common Subsequence, 최장 공통 부분 수열)문제는 두 수열이 주어졌을 때,
    // 모두의 부분 수열이 되는 수열 중 가장 긴 것을 찾는 문제이다.

    //예를 들어, ACAYKP와 CAPCAK의 LCS는 ACAK가 된다. lis같은 느낌인데, 두 수열의 공통된 가장 긴 부분

    // 2차원 배열로 수를 채워서 비교하는데 예를 들어  aca와 cap를 비교한다면 aca 와 차례대로c,ca,cap를 비교하는 게 이해가 안간다
    // 설명으로는 순서가 상관있기에 전체부분수열로 비교하는데 이 개념이 어렵다
    private static int[] dp1;
    private static char[] f;
    private static char[] s;
    private static char[] sd;
    static char[] A, B;
    static int[][] dp;
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        String first = br.readLine(); // 따로 잘라서 넣을 수 있는 걸로 아는데 찾아보자
//        String second = br.readLine();
//
//
//        f = new char[first.length()];
//        s = new char[second.length()];
//
//        for (int i = 0; i < f.length; i++) {
//            f[i] = first.charAt(i);
//            s[i] = second.charAt(i);
//
//
//        }
//        // 일치하는 수면 dp[i]와 dp[j]수가 일치 하는 지도 확인 후 계속 추가해서 더 큰 값을 저장 ?
//        // 원래 lis는 증가가 기준인데 이건 기준을 다른 수열과 같은 지를 비교해서 같다면 추가의 형식
//
//
//        for (int i = 0; i < f.length; i++) {
//            dp[1] = 1;
//
//            for (int j = 0; j < i; j++) {
////                if(f[i]) // 현재 배열의 수 f 배열 안ㅇ ㅔ있으면서 s 배열의 수도 안에 있어야 만족
//                    //
//
//            }
        String a = br.readLine();
        String b = br.readLine();
        // 각 문자열의 길이가 다르므로 따로 저장해둔다.
        int alength = a.length();
        int blength = b.length();
        // 각 문자열을 나눠서 저장할 char 배열.
        A = new char[alength + 1];
        B = new char[blength + 1];
        // 각 문자열을 char 배열에 문자 하나씩 옮겨 담는다.
        for(int i = 1; i <= alength; i++) {
            A[i] = a.charAt(i - 1);
        }
        for(int i = 1; i <= blength; i++) {
            B[i] = b.charAt(i - 1);
        }

        // 각 문자의 비교가 끝났을 때, 해당 위치에서 가질 수 있는 LCS의 값을 저장할 2차원 dp테이블을 정의한다.
        // 첫 행에서도 이전 문자를 참고할 수 있도록 패딩을 준다.
        dp = new int[blength + 1][alength + 1];

        // B의 모든 문자열을 A문자열과 비교
        for(int i = 1; i <= blength; i++) {
            for(int j = 1; j <= alength; j++) {
                // 만일 두 문자가 같은 경우
                if(B[i] == A[j]) {
                    // 대각선의 값을 참고하여 LCS의 값을 + 1한다.
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                // 두 문자가 다른 경우
                else {
                    // 각 문자열의 이전 문자 중 최대 LCS값을 선택.
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // 최종으로 탐색한 위치에 LCS의 최대 값이 저장되어 있을 것이다.
        System.out.println(dp[blength][alength]);
    }
        }





    }
}

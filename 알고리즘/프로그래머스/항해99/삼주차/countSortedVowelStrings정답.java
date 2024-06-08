package 알고리즘.프로그래머스.항해99.삼주차;

public class countSortedVowelStrings정답 {

    // 모음 리스트
    private static char[] vowel = new char[] {'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) {
        int n = 7;
        System.out.println(countVowelStrings(n));  // 예시 테스트
    }

    public static int countVowelStrings(int n) {
        // dp 배열 초기화
        int[][] dp = new int[n + 1][5];
        int[] dp1 = new int[]{1, 1, 1, 1, 1};

//        for (int i = 1; i < n; i++) {
//            for (int j = 4; j >= 0; j--) {
//                dp1[j] = dp1[j] + dp1[j + 1];
//
//            }
//        }
//
//        return dp1[0] + dp1[1] + dp1[2] + dp1[3] + dp1[4];

//         길이가 1인 경우 초기화
        for (int j = 0; j < 5; j++) {
            dp[1][j] = 1;
        }

        // DP 테이블 채우기
        for (int i = 2; i <= n; i++) {

            for (int j = 0; j < 5; j++) {

                for (int k = j; k < 5; k++) {
                    dp[i][j] = dp[i][j] + dp[i - 1][k];
                }
            }
        }

        // 결과 계산
        int result = 0;
        for (int j = 0; j < 5; j++) {
            result += dp[n][j];
        }

        return result;
    }
}
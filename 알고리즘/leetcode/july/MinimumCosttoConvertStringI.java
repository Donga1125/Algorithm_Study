package 알고리즘.leetcode.july;

import java.util.Arrays;

public class MinimumCosttoConvertStringI {

    // 2976. Minimum Cost to Convert String I

    //불가능하면 -1
    // source를  target으로 바꾸고 싶은데
    // 각 char마다 바꿀 수 있는 표가 있고 비용이 있다.
    // 최소 비용으로 바꾸고 최소 비용의 합을 반환하거나 안된다면 -1 반환
    //source = "abcd", target = "acbe", original = ["a","b","c","c","e","d"],
    // changed = ["b","c","b","e","b","e"], cost = [2,5,5,1,2,20]

    public static void main(String[] args) {

        String s = "abcd";
        String t = "acbe";
        char[] ori = new char[] {'a', 'b', 'c', 'c', 'e', 'd'};
        char[] change = new char[]{'b', 'c', 'b', 'e', 'b', 'e'};
        int[] cost = new int[]{2, 5, 5, 1, 2, 20};
        MinimumCosttoConvertStringI main = new MinimumCosttoConvertStringI();
        main.minimumCost(s, t, ori, change, cost);




    }


    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        // 소스를 타겟으로 바꿀려면
        // 바꿀려는 ori에서 있는지 찾고, change로 바꾸는데 먼저 고려해야할 게 저장될 값이
        // a->b로 가기 위해 바로 가는 게 싼가 아니면 돌아서 가는 게 싼가? 를 고려 해야함 이건
        // 매 선택에 따라 최소 값을 정할 수 있어서 dp 배열로 관리할 수 있을 거 같다
        // 그리고 dp 저장 전 change를 좀 더 빠르게 불러올 수 있는 정보를 저장하는게 좋을듯 ? map이라던지..

        int length = source.length();

        int dp[][] = new int[26][26]; // from to로 알파벳 변환
        for (int i = 0; i < 26; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE / 2);

            dp[i][i] = 0; // a ->a 가는 자기 자신 채우는 경우는 아예 없는 걸로 플로이드 워셜
        }

        for (int i = 0; i < length; i++) {

            int from = original[i] - 'a';
            int to = changed[i] - 'a';
            dp[from][to] = Math.min(dp[from][to], cost[i]);
            // a-b로 변환하는 규칙이 2개가 있을 수 있다 그럴 경우 저장된 값보다 작은 값을 저장하기 위해
            //min을 사용

        }


        for (int i = 0; i <26; i++) {
            for (int j = 0; j < 26; j++) {
                for (int k = 0; k < 26; k++) {

                    dp[j][k] = Math.min(dp[j][k], dp[j][i] + dp[i][k]);
                    // j->k 바로가는 비용이랑 j에서 i 거치고, i->k로 가는 비용이랑 최소 값 비교
                    // i는 거쳐가는 노드이다. 플로이드워셜 알고리즘의 핵심
                }
            }
        }

        int totalCost = 0;
        for (int i = 0; i < length; i++) {
            int from = source.charAt(i) - 'a';
            int to = target.charAt(i) - 'a';

            if (dp[from][to] == Integer.MAX_VALUE / 2) {
                return -1;
            }
            totalCost += dp[from][to];
        }

        return totalCost;

    }
}

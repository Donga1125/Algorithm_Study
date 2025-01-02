package 알고리즘.leetcode.january25;

public class MaximumScoreAfterSplittingaString효율 {

    // 1422. Maximum Score After Splitting a String

    // 0과 1로 이루어진 s가 주어지는데, 왼쪽에 0이 있으면 +1, 오른쪽에 1이 있다면
    // +1 방식으로 가장 큰 스코어를 반환해라. (한 쪽에 모는 건 안되고, 다 따로 분해도 x)


    public static void main(String[] args) {
        String s = "011101";
        MaximumScoreAfterSplittingaString효율 sol = new MaximumScoreAfterSplittingaString효율();
        System.out.println(sol.maxScore(s));
    }

    // 효율적인 방법
    // 먼저 1을 다 센다음 현재 1이 나올경우 총 1의 수에서 뺴주고,
    // 0이 나올경우 왼쪽에 +1해줘서 토탈을 세주면 2중 for 안돌려도 되네




        public int maxScore(String s) {
            int totalOnes = 0;
            int maxScore = 0;
            int leftZeros = 0;

            // 오른쪽에 있는 1의 총 개수를 계산
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    totalOnes++;
                }
            }

            // 문자열을 순회하며 최대 점수 계산
            for (int i = 0; i < s.length() - 1; i++) {
                char c = s.charAt(i);

                // 왼쪽 부분에 0이 추가되면 증가
                if (c == '0') {
                    leftZeros++;
                } else { // 오른쪽 부분에서 1을 하나 제거
                    totalOnes--;
                }

                // 최대 점수 갱신
                maxScore = Math.max(maxScore, leftZeros + totalOnes);
            }

            return maxScore;
        }
    }


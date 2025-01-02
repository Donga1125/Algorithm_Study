package 알고리즘.leetcode.january25;

public class MaximumScoreAfterSplittingaString {

    // 1422. Maximum Score After Splitting a String

    // 0과 1로 이루어진 s가 주어지는데, 왼쪽에 0이 있으면 +1, 오른쪽에 1이 있다면
    // +1 방식으로 가장 큰 스코어를 반환해라. (한 쪽에 모는 건 안되고, 다 따로 분해도 x)


    public static void main(String[] args) {
        String s = "011101";
        MaximumScoreAfterSplittingaString sol = new MaximumScoreAfterSplittingaString();
        System.out.println(sol.maxScore(s));
    }


    public int maxScore(String s) {

        int size = s.length();
        int total = 0;

        for (int i = 0; i < size-1; i++) {
            int leftC = 0;
            int rightC = 0;

            String left = s.substring(0, i + 1);
            String right = s.substring(i+1);




            for (int j = 0; j < left.length(); j++) {
                if (left.charAt(j) == '0') {
                    leftC++;

                }
            }
            for (int j = 0; j < right.length(); j++) {
                if (right.charAt(j) == '1') {
                    rightC++;
                }
            }
            total = Math.max(total, leftC + rightC);

        }

        return total;

    }
}

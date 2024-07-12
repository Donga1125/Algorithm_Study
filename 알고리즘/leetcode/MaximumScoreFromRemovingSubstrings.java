package 알고리즘.leetcode;

public class MaximumScoreFromRemovingSubstrings {

    //1717. Maximum Score From Removing Substrings

    //String 값을 주고, ab를 지우면 x점수, ba를 지우면 y점수를 얻을 수 있다
    // 최대 얻을 수 있는 점수를 반환
    // 높은 점수대로 그리디를 쓰면 될 것 같은데
    // 예외가 있을수도 있어보인다 있으면 dp를 쓰러 오


    public static void main(String[] args) {

        String s = "cdbcbbaaabab";
        int x = 5;
        int y = 4;

    }

    public int maximumGain(String s, int x, int y) {

        // x가 ㄷ ㅓ큰지 y가 더 큰지에 따라 다른데
        // 더 큰걸 판별하고 같다면 둘 중 하나로 하자
        // 둘다 해봐야할 것 같은데 ?.. 이래서 dp가 편해보이긴하는데..

        //현재 x제거했을 때와 y를 제거했을때의 값을 저장해가면서 두 분기로
        // 현재 dp 에 담기는 값은


    }

}

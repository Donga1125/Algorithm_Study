package 알고리즘.leetcode.august;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

    // 40. Combination Sum II
    // 더해서 타켓이 되는 조합의 모든 후보들의 리스트를 반환

    // 1. 정렬해서 슬라이딩 윈도우
    // 시작 인덱스부터 right만 조정해서 sum 타겟을 만들고
    // 조정은 target이 넘지 않게, 움직여가면서 right가 target보다 커지면 끝
    /// 위 틀렸다 다시 짜자 공식

    public static void main(String[] args) {

        int[] candidates = new int[]{10, 1, 2, 7, 6, 1, 5};
        int tartget = 8;
        CombinationSumII sol = new CombinationSumII();
        sol.combinationSum2(candidates, tartget);
    }



    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> Combi = new ArrayList<>();

        Arrays.sort(candidates);



        return

    }
}

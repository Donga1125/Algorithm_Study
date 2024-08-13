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

    //8을 만들기 위해, 배열들의 요소들로 8을 만들어야 한다
    // 그러면 8을 만들기 위한 요소들도 또 작게 자를 수 있다
    // 작게 자른 애들도 배열의 요소로 저장
    // dp는 고유성을 유지하기 힘들다 같은 수가 들어올 수 있어서..

    // backtracking을 사용해야한다고 한다
    static int target;
    static int[] candidates;
    static List<List<Integer>> answer = new ArrayList<>();


    public static void main(String[] args) {

        int[] candidates = new int[]{10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        CombinationSumII sol = new CombinationSumII();
        sol.combinationSum2(candidates, target);
    }



    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.target = target;

        List<Integer> Combi = new ArrayList<>();
        this.candidates = candidates;

        Arrays.sort(candidates);

        backTracking(0, new ArrayList<>(), 0);



        return answer;

    }

    private void backTracking(int idx, List<Integer> list, int sum) {

        if (sum == target) {
            answer.add(list);

            return;

        }
        if (sum > target) {
            return;
        }


        // 호출 시 sum에 현재 idx의 값 추가해서 넘기기 list는


        for (int i = idx; i < candidates.length; i++) {

            list.add(candidates[i]);
            backTracking(i, list, sum + candidates[i]);

            list.remove(list.size() - 1); // 제거

        }



    }


}

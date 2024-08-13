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



    public static void main(String[] args) {

        int[] candidates = new int[]{10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        CombinationSumII sol = new CombinationSumII();
        sol.combinationSum2(candidates, target);
    }



    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.target = target;


        this.candidates = candidates;

        Arrays.sort(candidates);
        List<List<Integer>> answer = new ArrayList<>();

        backTracking(answer, 0, new ArrayList<>(), 0);



        return answer;

    }

    private void backTracking(List<List<Integer>> answer, int idx, List<Integer> list, int sum) {

        if (sum == target) {
            answer.add(new ArrayList<>(list));
            // 객체 참조로 원본 combinationSum2에 있는 answer이 값이 변경됨 static으로 안띄어도 됨

            return;

        }
        if (sum > target) {
            return;
        }


        // 호출 시 sum에 현재 idx의 값 추가해서 넘기기 list는


        for (int i = idx; i < candidates.length; i++) {

            if (i > idx && candidates[i] == candidates[i - 1]) {
                continue;  // 중복된 요소를 건너뜀
            }

            list.add(candidates[i]); // 리스트에 먼저 추가하고, 그다음에 제거해주는 방식의 백트랙킹의 핵심을 놓침

            backTracking(answer,i + 1, list, sum + candidates[i]);

            list.remove(list.size() - 1); // 제거

        }


    }


}

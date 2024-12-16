package 알고리즘.leetcode.december;

import java.util.Arrays;

public class FinalArrayStateAfterKMultiplicationOperationsI {

    //3264. Final Array State After K Multiplication Operations I

    // num 배열과 k번 연산과 연산할 연산자 multipler를 주는데,
    // 가장 작은 수에다가 * multipler를 해준다 총 k번 해주면 됨

    // 최대 num은 100개, k는 10 최악은 1000인데 다 탐색보다 더 좋은 게 있을 거 같음
    // 첫번째 탐색 때 순번을 다 정해주고, ( 정렬해줘라 )
    // 계산 후 다시 정렬해줘야 하네
    public static void main(String[] args) {

        int nums[] = new int[]{2, 1, 3, 5, 6};
        int k = 5;
        int multi = 2;

    }

    // 1 실패, 오름차순 정렬은 순서 유지해야 해서 xx

    // 베스트 정렬 후 첫번째를 multi해준 후, 다시 merge sort를 해주자.


    public int[] getFinalState(int[] nums, int k, int multiplier) {



        for (int i = 0; i < k; i++) {
            Arrays.sort(nums);
            nums[0] *= multiplier;
        }

        return nums;

    }


}

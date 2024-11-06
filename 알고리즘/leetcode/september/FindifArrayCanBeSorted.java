package 알고리즘.leetcode.september;

public class FindifArrayCanBeSorted {

    // 인접한 두 원소를 교환할 수 있는데,
    // 교환 하려면, 두 원소의 set bit가 같아야한다.
    // set bits는 2진수에서 1로 설정된 비트의 개수입니다.
    // 가능하면 true 아니면 false를 반환

    public static void main(String[] args) {

        FindifArrayCanBeSorted sol = new FindifArrayCanBeSorted();
        int[] arr = new int[]{8, 4, 2, 30, 15};
        sol.canSortArray(arr);

    }

    public boolean canSortArray(int[] nums) {

    }
}

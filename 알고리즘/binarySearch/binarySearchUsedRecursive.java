package 알고리즘.binarySearch;

public class binarySearchUsedRecursive { // 어렵다

    private int answer = -1;

    public void dfs(int[]arr, int left, int right,  int target) {
        if (left > right) {  // 1. 종료조건
            return;
        }

        // 2.수행 동작
        int mid = (left + right) / 2;

        if (arr[mid] == target) {
            answer = arr[mid];
        } else if (arr[mid] < target) { // 타겟이 더 크단 의미는 왼쪽 값을 찾을 필요가 없다.
            dfs(arr, mid + 1, right, target);
        } else dfs(arr, left, mid + 1, target);


    }

    public int bs(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        dfs(arr, left, right, target );
        return answer;
    }

    public static void main(String[] args) {
        binarySearchUsedRecursive bs = new binarySearchUsedRecursive();
        int[] arr = {0, 1, 3, 5, 6, 7, 9, 11, 23, 24, 27, 28, 32, 33, 36, 38, 40, 44, 51, 55, 60};
        int target = 11;
        System.out.println(bs.bs(arr, target));

    }
}

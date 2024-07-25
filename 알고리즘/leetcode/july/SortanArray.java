package 알고리즘.leetcode.july;

public class SortanArray {

    //912. Sort an Array

    //오름차순 정렬 O(nlogN) 시간 복잡도를 가지고
    //작은 time complexity를 가지면 되는데,
    // 다른 함수를 쓰지 않고 해라
    // 시간복잡도가 가장 낮고, O(NlogN)을 가지는 정렬을 쓰라는 뜻
    // merge sort 쓰면 될듯 ?
    // 분할과 정분할

    public static void main(String[] args) {
        //

        int[] arr = new int[]{5, 2, 3, 1};
        SortanArray main = new SortanArray();
        main.sortArray(arr);

    }



    public int[] sortArray(int[] nums) {

        int answer[] = new int[nums.length];

        // 1.

        mergeSort();



    }

    private void mergeSort() {
    }


}

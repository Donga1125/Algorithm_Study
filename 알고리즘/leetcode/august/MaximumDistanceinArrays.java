package 알고리즘.leetcode.august;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumDistanceinArrays {

    //624. Maximum Distance in Arrays

    // 정렬된 배열이 주어지고(하나의 시작과 끝 고르면 탐색이 더 편할듯? 이러면 O(n)이면 충분할 거 같아)
    // 두 배열의 수를 고르고정렬돤 배열들 사이 가장 큰 거리를 반환해라


    public static void main(String[] args) {

        int[][] arrays = new int[][]{{1, 2, 3}, {4, 5}, {1, 2, 3}};
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1, 2, 3));  // 첫 번째 리스트 추가
        arr.add(Arrays.asList(4, 5));     // 두 번째 리스트 추가
        arr.add(Arrays.asList(1, 2, 3));  // 세 번째 리스트 추가

        MaximumDistanceinArrays sol = new MaximumDistanceinArrays();
        System.out.println(sol.maxDistance(arr));

    }

    public int maxDistance(List<List<Integer>> arrays) {

        int distance = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (List<Integer> array : arrays) {
            min = Math.min(min, array.get(0));
            max = Math.max(max, array.get(array.size()-1));
        }

        return max - min;



    }
}

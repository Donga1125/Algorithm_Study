package 알고리즘.leetcode.december;

import 알고리즘.단계별백준.이차원배열.최댓값;

import java.util.*;

public class MaximumBeautyofanArrayAfterApplyingOperation {

    // 2779. Maximum Beauty of an Array After Applying Operation

//     아직 선택되지 않은 배열의 인덱스 하나를 선택함
//     i를 i -k , i+k 범위 내에서 임의의 정수로 교체할 떄 배열 nums의 아름다움의 최댓값 반환
//     아름다움이란 동일한 요소 이루어진 가장 부분 수열의 길이
//     그리고 최대 값이여야 한다
//
//     전체적으로 모든 수를 잡고 검사해여봐야함
//     그렇다면 첫번 째로 배열 안에서 k 범위만큼 빼고 더해주는 배열을 만들어주고
//     찾기 쉽게 인덱스 맵으로 value를 넣어주고, 그 중 모든 범위에 있는 수 중 가장 큰 걸로 배열을 만든 후
//     그 수를 세서 리턴

    public static void main(String[] args) {
        int nums[] = new int[]{4, 6, 1, 2};
        int k = 2;
        MaximumBeautyofanArrayAfterApplyingOperation main = new MaximumBeautyofanArrayAfterApplyingOperation();
        System.out.println(main.maximumBeauty(nums, k));
    }

    public int maximumBeauty(int[] nums, int k) {



        int length = nums.length;

        if (nums.length == 1) {
            return 1;
        }

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> acc = new ArrayList<>();

        for (int i = 0; i < length; i++) {

            int now = nums[i];

            for (int j = now - k; j <= now +k  ; j++) {
                acc.add(j);

                if (!map.containsKey(i)) {
                    List<Integer> list =new ArrayList<>();
                    list.add(j);
                    map.put(i, list);
                } else
                    map.get(i).add(j); // get으로 가져와서 계속 추가하는 경우는 list처럼 여러 개를 쓸 때

            }
        }


        for (Map.Entry<Integer, List<Integer>> integerListEntry : map.entrySet()) {
            System.out.println(integerListEntry);
        }

        List<Integer> all = new ArrayList<>();
        for (List<Integer> value : map.values()) {

            for (Integer i : value) {
                all.add(i);

            }
        }
        Collections.sort(all);





        int max = 0;
        int count = 1;


        for (int i = 0; i < all.size() -1; i++) {

            if (all.get(i).equals(all.get(i + 1))) {
                count++;

            } else
                count = 1;

            if (max < count) {
                max = count;
            }
        }

        return max;
//        return 1;

    }
}

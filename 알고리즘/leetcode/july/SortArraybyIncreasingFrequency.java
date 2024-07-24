package 알고리즘.leetcode.july;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortArraybyIncreasingFrequency {


    public static void main(String[] args) {

        int[] nums = new int[]{2, 3, 1, 3, 2};
        SortArraybyIncreasingFrequency main = new SortArraybyIncreasingFrequency();
        main.frequencySort(nums);
    }


    public int[] frequencySort(int[] nums) {

        // 빈도 수에 따른 정렬
        // 정렬된 배열의 index는 빈도를 뜻함 index 1은 1의 frequency
        // 만약 빈도가 같다면 더 큰 수별로 정렬 와야함

        // map으로 각 key와 value 값을 추가하면 될듯 ?

        HashMap<Integer, Integer> map = new HashMap<>();


        int length = nums.length ;
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int now = 0;

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());

        entries.sort((a,b) ->
                { // 람다식
                    if (!a.getValue().equals(b.getValue())) { // 둘의 밸류(빈도)가 다르면 빈도가 작은 거부터
                        return Integer.compare(a.getValue(), b.getValue());
                    } else // 둘의 빈도가 같다면 key(그 수 자체가 큰 순서)로
                        return Integer.compare(b.getKey(), a.getKey());

                }
                );
        int index = 0;

        for (Map.Entry<Integer, Integer> entry : entries) {
            int num = entry.getKey(); // 배열에 저장할 숫자 그 자체가 키
            int freq = entry.getValue();// 배열에 저장할 숫자의 빈도라 몇번인지 확인
            for (int i = 0; i < freq; i++) {
                answer[index++] = num; // index를 따로 지정해줘서 ++로 계속 변화

            }

        }




        return answer;

    }
}

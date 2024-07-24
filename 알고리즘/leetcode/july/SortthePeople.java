package 알고리즘.leetcode.july;

import java.util.Arrays;
import java.util.Comparator;

public class SortthePeople {


    public static void main(String[] args) {

        String[] names = new String[]{"Mary", "John", "Emma"};
        int[] heights = new int[]{180, 165, 170};

        SortthePeople main = new SortthePeople();
        main.sortPeople(names, heights);


    }

    public String[] sortPeople(String[] names, int[] heights) {

        // 정렬을 하는데 기준을 height이 desc로 name에 맞춰서

        int length = heights.length;

        Integer[] nums = new Integer[length];


        for (int i = 0; i < length; i++) {
            nums[i] = i;

        }

        Arrays.sort(nums, (a, b) -> Integer.compare(heights[b], heights[a]));


        String[] answer = new String[length];


        for (int i = 0; i < length; i++) {
            answer[i] = names[nums[i]];
        }

        System.out.println(Arrays.toString(answer));



            // 람다식 desc


        return answer;

    }
}

package 알고리즘.leetcode.august;

import java.util.ArrayList;
import java.util.Arrays;

public class KthLargest {

    int k;
    Integer[] tempNums;
    ArrayList<Integer> list;



    int length;


    public KthLargest(int k, int[] nums) {

        // 초기화 시 0일수가 있다. 빈배열 들어올 경우 생각

        this.k = k;


        tempNums = Arrays.stream(nums).boxed().toArray(Integer[]::new);


        Arrays.sort(tempNums, (a, b) -> {
            return b - a;
        });

        list = new ArrayList<>(Arrays.asList(tempNums));
        length = list.size();



    }

    public int add(int val) {

        if (length == 0) {
            list.add(val);
        } else {

        for (int i = 0; i < length; i++) {
            if (list.get(i) < val) {
                list.add(i, val);
                break;


            }
        }}


        return list.get(k -1);

    }
}

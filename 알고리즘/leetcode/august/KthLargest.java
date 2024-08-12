package 알고리즘.leetcode.august;

import java.util.ArrayList;
import java.util.Arrays;

public class KthLargest {

    int k = 0;
    Integer[] tempNums;
    ArrayList<Integer> list;



    int length;


    public KthLargest(int k, int[] nums) {

        this.k = k;
        tempNums = Arrays.stream(nums).boxed().toArray(Integer[]::new);


        Arrays.sort(tempNums, (a, b) -> {
            return b - a;
        });

        list = new ArrayList<>(Arrays.asList(tempNums));
        length = list.size();



    }

    public int add(int val) {

        for (int i = 0; i < length; i++) {
            if (list.get(i) < val) {
                list.add(i, val);
                break;


            }
        }
        System.out.print("[");
        for (Integer i : list) {

            System.out.print(i + " ");
        }
        System.out.print("]");
        System.out.println();


        return list.get(k -1);

    }
}

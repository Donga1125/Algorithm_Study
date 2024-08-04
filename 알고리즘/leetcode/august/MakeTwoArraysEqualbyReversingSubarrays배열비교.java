package 알고리즘.leetcode.august;

import java.util.Arrays;

public class MakeTwoArraysEqualbyReversingSubarrays배열비교 {

    public static void main(String[] args) {

        int[] target = new int[]{1, 2, 3, 4};
        int[] arr = new int[]{2, 4, 1, 3};


        MakeTwoArraysEqualbyReversingSubarrays sol1 = new MakeTwoArraysEqualbyReversingSubarrays();
        System.out.println(sol1.canBeEqual(target,arr));
    }


    public boolean canBeEqual(int[] target, int[] arr) {

        int elementCount[] = new int[1001];

        for (int i = 0; i < target.length; i++) {
            elementCount[target[i]]++;
            elementCount[arr[i]]--;
        }

        for (int i : elementCount) {
            if (i != 0) {
                return false;
            }
        }

        return true;

        }
    }

//


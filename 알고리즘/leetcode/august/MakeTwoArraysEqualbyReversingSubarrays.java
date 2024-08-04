package 알고리즘.leetcode.august;

import java.util.*;

public class MakeTwoArraysEqualbyReversingSubarrays {

    //1460. Make Two Arrays Equal by Reversing Subarrays

    //아무거나 뒤집을 수 있는데 몇번이나 상관 x
    //그랬을 때 target을 만들 수 있냐 ?

    public static void main(String[] args) {

        int[] target = new int[]{1, 2, 3, 4};
        int[] arr = new int[]{2, 4, 1, 3};


        MakeTwoArraysEqualbyReversingSubarrays sol = new MakeTwoArraysEqualbyReversingSubarrays();
        System.out.println(sol.canBeEqual(target,arr));
    }


    public boolean canBeEqual(int[] target, int[] arr) {

//        HashSet<Integer> set = new HashSet<>();
        // set으로 관리하면 안됨 같은 수가 들어올 수 있음

        int sum = 0;
        // sum쓰면 좋아보이지만 끝까지 돌아야한다.. 그래도 나쁘지 않을듯?
        // set은 실패했고 sum으로 관리

        // sum도 숫자는 다르지만 sum이 같을 수 있어서 실패

        // 둘 다 정렬하면 될듯?

        Arrays.sort(arr);
        Arrays.sort(target);

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != target[i]) {
                return false;
            }

        }
        return true;



//        for (int i = 0; i < arr.length; i++) {
////            set.add(arr[i]);
////            sum += arr[i];
//
//
//
//        }

//        for (int i : target) {
//            if(!set.contains(i)) {
//
//                return false;
//            }
//        }

//        int check = 0;
//        for (int i = 0; i < target.length; i++) {
//
//            check += target[i];
//
//        }
//
//        if (sum == check) {
//            return true;
//        }


//        return false;

    }
}

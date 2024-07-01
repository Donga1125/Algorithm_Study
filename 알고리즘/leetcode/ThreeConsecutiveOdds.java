package 알고리즘.leetcode;

import java.util.ArrayList;

public class ThreeConsecutiveOdds {

    //Three Consecutive Odds
    // 배열 중 연속된 odd가 있다면 true 아님 false
    // 홀수를 다 계산해서 넣을까 ?
    // 다른 자료구조를 사용해서 세개씩 넣어주고, 반환 ?

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12};
        int[] arr1 = new int[]{2,6,4,1};
        int[] arr2 = new int[]{1,1,1};
        ThreeConsecutiveOdds main = new ThreeConsecutiveOdds();
        System.out.println( main.threeConsecutiveOdds(arr2));

    }

    public boolean threeConsecutiveOdds(int[] arr) {



            ArrayList<Integer> arrayList = new ArrayList<>();
            int count = 0;


//            for (int i = 0; i < arr.length; i++) {
//                int current = arr[i];
//
//                if (arrayList.size() == 3) {
//                    return true;
//                }
//
//                if (current % 2 != 0) {
//                    arrayList.add(current);
//
//                } else
//                    arrayList = new ArrayList<>();
//            }
//
//        if (arrayList.size() == 3) {
//
//            return true;
//        } else {
//            return false;
//        }

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];

            if (current % 2 != 0) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else
                count = 0;
        }

        return false;



        }

//    public boolean dfs(ArrayList<Integer> arrayList, int now) {
//
//
//        if (arrayList.size() == 3) {
//
//            return true;
//        }
//
//        for (int i = 0; i < ; i++) {
//
//        }


    }

package 알고리즘.leetcode.august;

import java.util.HashMap;
import java.util.Map;

public class KthDistinctStringinanArray {

    // 2053. Kth Distinct String in an Array

    // 별개의 String 찾고, 그 찾은 것 중에 k번째 반환

    public static void main(String[] args) {

        String arr[] = new String[]{"d", "b", "c", "b", "c", "a"};

        int k = 2;
        KthDistinctStringinanArray main = new KthDistinctStringinanArray();
        System.out.println(main.kthDistinct(arr, k));

    }

    public String kthDistinct(String[] arr, int k) {

        // 1 map으로 넣고, 넣은 후 찾는 걸 배열 순서대로 찾으면 될 듯 ?k 만족 시 반환


        // map에 넣고 찾기 처음에 142ms 나오길래 이새ㅏㅇ했는데 다시하니 6~7ms

        HashMap<String, Integer> map = new HashMap<>();

        int length = arr.length;

        for (int i = 0; i < length; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }

        int count = 0;


        for (int i = 0; i < length; i++) {

            int few = map.get(arr[i]);

            if (few == 1) {
                count++;


                if (count == k) {
                    return arr[i];
                }
            }
            }

        return "";

        }






}

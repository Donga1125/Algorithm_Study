package 알고리즘.leetcode.september;

import java.util.HashMap;
import java.util.HashSet;

public class CounttheNumberofConsistentStrings {

    // allow가 주어지고 이 allow를 다 갖고 있는 word의 수를 반환
    // word의 수는 몇개든 상관 x 그냥 allow로 구성되어 있음 됨
    // 그럼 allow를 map에 저장 후 하나의 배열씩 돌면서 다돌아도 map에 포함되면
    // count ++

    public static void main(String[] args) {

        String allowed = "ab";
        String allowed1 = "abc";

        String[] arr = new String[]{"ad", "bd", "aaab", "baa", "badab"};
        String[] arr1 = new String[]{"a","b","c","ab","ac","bc","abc"};

        CounttheNumberofConsistentStrings sol = new CounttheNumberofConsistentStrings();
//        System.out.println(sol.countConsistentStrings(allowed,arr));
        System.out.println(sol.countConsistentStrings(allowed1,arr1));

    }

    public int countConsistentStrings(String allowed, String[] words) {

        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < allowed.length(); i++) {
            map.put(allowed.charAt(i), 1);
            set.add(allowed.charAt(i));

        }

        for (int i = 0; i < words.length; i++) {
            String now = words[i];

            int match = 0;
            int length = now.length();

            for (int j = 0; j < length; j++) {

                if (!map.containsKey(now.charAt(j))) {
                    break;

                }
//                if (!set.contains(now.charAt(j))) {
//                   break;
//                }
                match++;
            }


            if (match == length) {
                count++;
            }

        }

        return count;ㅎ



    }


}

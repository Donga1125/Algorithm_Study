package 알고리즘.leetcode.september;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UncommonWordsfromTwoSentences {

    // 884. Uncommon Words from Two Sentences
    // s1이라면 s2에서 없어야 하고, s1에서 반복적이지 않아야함

    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        String s3 = "apple apple";
        String s4 = "banana";

        UncommonWordsfromTwoSentences sol = new UncommonWordsfromTwoSentences();
        System.out.println(sol.uncommonFromSentences(s3,s4));

    }

    public String[] uncommonFromSentences(String s1, String s2) {

        ArrayList<String> list = new ArrayList<>();
        String[] now1 = s1.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : now1) {
            map.put(s, map.getOrDefault(s, 0) + 1);

        }
        String[] now2 = s2.split(" ");
        for (String s : now2) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());

            }
        }



        return list.toArray(new String[0]);


    }
}

package 알고리즘.leetcode.january25;

import java.util.HashMap;
import java.util.Map;

public class CountVowelStringsinRanges {

    //2559. Count Vowel Strings in Ranges

    // word 배열 안에서 queries의 거리가 주어지면 그 인덱스에서 모음으로 시작해서 모음으로 끝나는
    // 단어가 몇개 있는지 return..
    public static char[] vowels = new char[]{'a', 'e', 'o', 'i', 'u'};
    public static HashMap<Integer, Integer> map;


    public static void main(String[] args) {

        String[] words = new String[]{"aba", "bcb", "ece", "aa", "e"};
        int[][] queries = new int[][]{{0, 2}, {1, 4}, {1, 1}};
        CountVowelStringsinRanges main = new CountVowelStringsinRanges();
        main.vowelStrings(words, queries);

    }

    // 효율성을 위해서 word에서 모음으로 시작하고 끝나면 카운트 해서 다 저장?
    // 범위가 주어질 때 슬라이딩 윈도우로 해결하면 되려나
    //  ex 위 예로는 1 0 1 1 1로 저장해서 이 범위에 따라 구간 합을 반환?
    // 굳이 정해지면 하나씩 다 더해서 반환해도 될 거 같은데 굳이 슬라이딩 윈도우를 쓰지 않고..


    public int[] vowelStrings(String[] words, int[][] queries) {
        map = new HashMap<>();
        int[] answer = new int[queries.length];

        for (int i = 0; i < words.length; i++) {
            int nowSize = words[i].length();
            for (int j = 0; j < vowels.length; j++) {
                if (words[i].charAt(0) == vowels[j]) {

                    if (words[i].charAt(nowSize - 1) == vowels[j]) {
                        map.put(i, 0);
                    }
                    }
                }


        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry);

        }
        return answer;

    }


}

package 알고리즘.leetcode.january25;

public class CountVowelStringsinRanges {

    //2559. Count Vowel Strings in Ranges

    // word 배열 안에서 queries의 거리가 주어지면 그 인덱스에서 모음으로 시작해서 모음으로 끝나는
    // 단어가 몇개 있는지 return..

    public static void main(String[] args) {

        String[] words = new String[]{"aba", "bcb", "ece", "aa", "e"};
        int[][] queries = new int[][]{{0, 2}, {1, 4}, {1, 1}};
        CountVowelStringsinRanges main = new CountVowelStringsinRanges();
        main.vowelStrings(words, queries);

    }


    public int[] vowelStrings(String[] words, int[][] queries) {

    }


}

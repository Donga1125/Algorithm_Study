package 알고리즘.leetcode;


import java.util.HashMap;
import java.util.HashSet;


public class LongestSubstringWithoutRepeatingCharactersSlideWindow {

    //3. Longest Substring Without Repeating Characters


    // s 문자열이 주어지면 그 안에서  반복되지 않는 캐릭터를 가진 서브스트링을 찾는데, 가장 긴 걸로 찾아라
    // 5만개까지 들어오는데, n2로 하면 250,000으로 탐색 가능하다 어차피 중간에 반복되는 수가 들어오면
    // 멈출 생각이라 250,000까진 안가겠지만 더 효율적인 방법이 있을까
    // pwwkew면 pww가 들어오면 pw 만 저장 wk
    // 최대 길이를 저장해나가면서 갱신할껀데,

    //슬라이딩 원도우 떠올리긴 했는데 제대로 풀이를 못했다
    // pwwkew 라면 중복이 있음 하나씩 옮겨가자

    // 구간합을 구하는 느낌이네 자세히 말하자면 중복되지 않은 수까지의 구간합이 최대가 되는 것을 구하라
    // 그러면 slidingwindow

    // 유명한 문제, 구간합, 아나그램 (알파벳의 구성은 유지한채 순서만 바꿔서 새로운 문자 만들기 (listen -> silent)
    //pwwkew = [pww] wkew

    // 투포인터

    //왼쪽부터 시작해서 구간합을 구하는 거랑
    // 최대한 가깝게 만들기 위해 양 끝에서부터 시작해서 범위를 가변적으로 좁혀가기


    public static void main(String[] args) {

        String s = "pwwkew";
        String s1 = "bbbbb";
        String s2 = "abcabcbb";
        LongestSubstringWithoutRepeatingCharactersSlideWindow main = new LongestSubstringWithoutRepeatingCharactersSlideWindow();
        main.lengthOfLongestSubstring(s2);




    }



    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;


        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            if (map.containsKey(current)) {

                left = // 있으면 left 를 slidingWindow 하면 l,r 가 헷갈리는데.....

            }


            map.put(current, right); // 현재 index를 넣을 필요가 ?

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;

    }
}

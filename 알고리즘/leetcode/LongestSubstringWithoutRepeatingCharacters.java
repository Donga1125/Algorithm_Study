package 알고리즘.leetcode;


import java.util.HashSet;


public class LongestSubstringWithoutRepeatingCharacters {

    //3. Longest Substring Without Repeating Characters


    // s 문자열이 주어지면 그 안에서  반복되지 않는 캐릭터를 가진 서브스트링을 찾는데, 가장 긴 걸로 찾아라
    // 5만개까지 들어오는데, n2로 하면 250,000으로 탐색 가능하다 어차피 중간에 반복되는 수가 들어오면
    // 멈출 생각이라 250,000까진 안가겠지만 더 효율적인 방법이 있을까
    // pwwkew면 pww가 들어오면 pw 만 저장 wk
    // 최대 길이를 저장해나가면서 갱신할껀데,

    //슬라이딩 원도우 떠올리긴 했는데 제대로 풀이를 못했다
    // pwwkew 라면 중복이 있음 하나씩 옮겨가자


    public static void main(String[] args) {

        String s = "pwwkew";
        String s1 = "bbbbb";
        String s2 = "abcabcbb";
        LongestSubstringWithoutRepeatingCharacters main = new LongestSubstringWithoutRepeatingCharacters();
        main.lengthOfLongestSubstring(s2);




    }



    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int now = 0;

            for (int j = i; j < s.length(); j++) {

                // 현재 수와 같은 수가 안나오면을 어떻게 판별하지 ?
                //set의 사이즈로 ?
                set.add(s.charAt(j));
                now++;



                if (set.size() != now) {
                    count = Math.max(count, set.size());
                    set = new HashSet<>();
                    break;

                } else
                    count = Math.max(count, set.size());

            }
        }
        System.out.println(count);

        return count;

    }
}

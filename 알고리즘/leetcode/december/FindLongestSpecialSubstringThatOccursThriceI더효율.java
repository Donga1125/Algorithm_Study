package 알고리즘.leetcode.december;

import java.util.HashMap;

public class FindLongestSpecialSubstringThatOccursThriceI {

    //2981. Find Longest Special Substring That Occurs Thrice I

    // 주어진 s 소문자 영어 알파벳으로 구성되어 있음
    // 특수 문자열은 단일로 구성된 문자열을 의미함 "sss" "f" "vv"

    //문자열 s에서 적어도 3번 등장하는 가장 긴 특수 부분 문자열의 길이를 반환하세요.
    //만약 그런 부분 문자열이 존재하지 않으면, -1을 반환

    public static void main(String[] args) {

        String s = "abcaba";
        String s1 = "aaaa";

        // 1예의 경우 3번 이상 반복되는 특수문자는 a 하나로 1임
        // 2의 예는 aa, aa, aa 세개로 되고 2임 a,a,a도 되는데 가장 길지 않음

        FindLongestSpecialSubstringThatOccursThriceI main = new FindLongestSpecialSubstringThatOccursThriceI();
        System.out.println( main.maximumLength(s1));

    }

    // 먼저 특수한 문자열을 찾아야함, 단일로 이루어진 알파벳인지 확인
    // 단일 알파벳이 s에 몇 개 반복되는지


    public int maximumLength(String s) {

        int n = s.length(); // 문자열의 길이
        int maxLen = -1;    // 가장 긴 특수 부분 문자열의 길이를 저장 (-1로 초기화)

        // 가능한 모든 특수 부분 문자열의 길이를 순회
        for (int i = 1; i <= n; i++) {
            HashMap<String, Integer> frequencyMap = new HashMap<>();

            // 현재 길이(i)의 모든 부분 문자열을 확인
            for (int j = 0; j <= n - i; j++) {
                String substring = s.substring(j, j + i); // 길이 len의 부분 문자열 추출

                // 해당 부분 문자열이 "특수"인지 확인
                if (isSpecial(substring)) {
                    // 특수 문자열의 빈도를 업데이트
                    frequencyMap.put(substring, frequencyMap.getOrDefault(substring, 0) + 1);
                }
            }

            // 현재 길이(len)에 대해, 3번 이상 등장한 특수 부분 문자열이 있는지 확인
            for (int freq : frequencyMap.values()) {
                if (freq >= 3) {
                    maxLen = i; // 조건을 만족하면 maxLen 업데이트
                }
            }
        }
        return maxLen; // 결과 반환
    }

    // 문자열이 "특수"인지 확인하는 함수
    private static boolean isSpecial(String s) {
        char firstChar = s.charAt(0); // 첫 번째 문자
        // 문자열의 모든 문자가 첫 번째 문자와 같은지 확인
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != firstChar) {
                return false; // 다른 문자가 있으면 특수 문자열이 아님
            }
        }
        return true; // 모든 문자가 같으면 특수 문자열
    }

        //

    }

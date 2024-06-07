package 알고리즘.프로그래머스.항해99.삼주차;

public class countSortedVowelStrings {

    //1641. Count Sorted Vowel Strings

    //n이 주어지고, n의 length를 가진 주어진 a, e, i, o, u인 모음의 조합들을 사전순서로 정렬해서
    //총 몇개를 만들 수 있는 지 반환

    //ex
    //Input: n = 1
    //Output: 5
    //Explanation: The 5 sorted strings that consist of vowels only are ["a","e","i","o","u"]

    // Constraints:
    //1 <= n <= 50

    //dp 문제인데 aeiou라면 조합 문제인데 중복이 가능하니 중복 조합 ex)5H2 = n+r-1Cr = 6C2 = 15개

    private static char[] vowel = new char[] {'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) {

    }
    public int countVowelStrings(int n) {
        //top-down으로 하면

        for (int i = 0; i <; i++) {
            for (int j = i +1; j <; j++) {

            }
        }


        return 5;

    }


}
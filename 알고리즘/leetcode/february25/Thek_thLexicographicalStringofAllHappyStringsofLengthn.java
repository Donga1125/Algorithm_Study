package 알고리즘.leetcode.february25;

import java.util.ArrayList;

public class Thek_thLexicographicalStringofAllHappyStringsofLengthn {
    static int nSize;
    static ArrayList<String> answerList;
    static char[] happyString;


    // 1415. The k-th Lexicographical String of All Happy Strings of Length n

    // happy string을 만들기
    //n으로 문자열을 길이가 들어오고 사전순으로 정렬된 k번째 문자열 반환
    //알파벳 'a', 'b', 'c'만 사용하여 구성된 문자열.
    //연속된 문자가 동일하면 안 됨. (s[i] != s[i+1] for all i)
    // 만약 존재하지 않는 k번째라면 "" 반환


    public static void main(String[] args) {

        int n = 3;
        int k = 9;
        Thek_thLexicographicalStringofAllHappyStringsofLengthn main =
                new Thek_thLexicographicalStringofAllHappyStringsofLengthn();

        System.out.println(main.getHappyString(n, k));

    }

    // 순열의 문제인데 제약이 있다.. 연속되지 않은 순열


    public String getHappyString(int n, int k) {
        nSize = n;
        answerList = new ArrayList<>();

        happyString = new char[]{'a', 'b', 'c'};
        StringBuilder sb = new StringBuilder();


        backTracking(sb);

        return k <= answerList.size() ? answerList.get(k - 1) : "";
        // k보다 크거나 같으면 k번째 : 아니라면 "" 리턴
    }

    private void backTracking(StringBuilder sb) {

        int size = sb.length();

        if (size == nSize) {
            answerList.add(sb.toString());

            return;

        }

        for (char c : happyString) {
            if (size == 0 || sb.charAt(size - 1) != c) {
                //처음 들어올 때랑, 붙어있는 수가 아니라면
                sb.append(c);
                backTracking(sb);
                sb.deleteCharAt(sb.length() - 1);
            }
        }


    }
}

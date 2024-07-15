package 알고리즘.leetcode;

public class MaximumScoreFromRemovingSubstrings {

    //1717. Maximum Score From Removing Substrings

    //String 값을 주고, ab를 지우면 x점수, ba를 지우면 y점수를 얻을 수 있다
    // 최대 얻을 수 있는 점수를 반환
    // 높은 점수대로 그리디를 쓰면 될 것 같은데
    // 예외가 있을수도 있어보인다 있으면 dp를 쓰러 오
    private static String first = "ab";
    private static String second = "ba";




    public static void main(String[] args) {

        String s = "cdbcbbaaabab";
        String s1 = "aabbabkbbbfvybssbtaobaaaabataaadabbbmakgabbaoapbbbbobaabvqhbbzbbkapabaavbbeghacabamdpaaqbqabbjbababmbakbaabajabasaabbwabrbbaabbafubayaazbbbaababbaaha";
        int x = 4;
        int x1 = 1926;
        int y = 5;
        int y1 = 4320;

        MaximumScoreFromRemovingSubstrings main = new MaximumScoreFromRemovingSubstrings();
//        main.maximumGain(s1, x1, y1);
        System.out.println(main.maximumGain(s, x, y));

    }

    public int maximumGain(String s, int x, int y) {

        // x가 ㄷ ㅓ큰지 y가 더 큰지에 따라 다른데
        // 더 큰걸 판별하고 같다면 둘 중 하나로 하자


        //현재 x제거했을 때와 y를 제거했을때의 값을 저장해가면서 두 분기로

        // "cdbcbbaaabab" 의 경우 ab를 빼게되면 cdbcbbaaab, cdbcbbaa
        // 그냥 같을 경우엔 비교하자 그리디로 해서 둘다 빼봐서

        // 현재 돌면서 x먼저 빼고, 다음 스트링에서 또 x빼고 뺄 ㄱㅔ없음 y빼는 형식

        int xCount = 0;
        int xCount1 = 0;
        int yCount = 0;
        int yCount1 = 0;




        while (s.contains(first) || s.contains(second)) {
            //cdbcbbaaabab


            if (x >= y) {

                while (s.contains(first)) {



                    s = s.replaceFirst(first, "");
                    xCount1++;



              }

                while (s.contains(second)) {


                    s = s.replaceFirst(second, "");
                    yCount1++;

                    }



            } else if (x <= y) {

                while (s.contains(second)) {


                    s = s.replaceFirst(second, "");
                    yCount1++;

                   }


                while (s.contains(first)) {



                    s = s.replaceFirst(first, "");
                    xCount1++;



                   ;}
            }
        }




        return (xCount1 * x) + (yCount1 * y);

    }

}

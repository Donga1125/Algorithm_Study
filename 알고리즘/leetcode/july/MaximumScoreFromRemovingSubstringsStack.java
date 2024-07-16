package 알고리즘.leetcode.july;

public class MaximumScoreFromRemovingSubstringsStack {

    //1717. Maximum Score From Removing Substrings

    //String 값을 주고, ab를 지우면 x점수, ba를 지우면 y점수를 얻을 수 있다
    // 최대 얻을 수 있는 점수를 반환
    // 높은 점수대로 그리디를 쓰면 될 것 같은데
    // 예외가 있을수도 있어보인다 있으면 stack







    public static void main(String[] args) {

        String s = "cdbcbbaaabab";
        int x = 4;
        int y = 5;

        MaximumScoreFromRemovingSubstringsStack main = new MaximumScoreFromRemovingSubstringsStack();
        System.out.println(main.maximumGain(s,x,y));

    }

    public int maximumGain(String s, int x, int y) {




        if (x > y) {

            return useStack(s, x, y, "ab","ba");

        } else
            return useStack(s, y, x,"ba","ab");





    }

    private int useStack(String s, int x, int y,String first, String second) {

        int answerCount = 0;

        StringBuilder sb = new StringBuilder();

        int sLength = s.length();

        for (int i = 0; i < sLength; i++) {

            sb.append(s.charAt(i));
            int length = sb.length();

            if (length >= 2 && sb.substring(length - 2).equals(first)) {

                sb.delete(length - 2, length);
                answerCount = answerCount + x;

            }
        }

        s = sb.toString(); // 빼고 남아진 s를 만들어주기
        sb = new StringBuilder();

        sLength = s.length();


        for (int i = 0; i < sLength; i++) {
            sb.append(s.charAt(i));

            int length = sb.length();

            if (sb.length() >= 2 && sb.substring(length - 2).equals(second)) {

                sb.delete(length - 2, length);

                answerCount = answerCount + y;
            }
        }



        return answerCount;

    }

}

package 알고리즘.leetcode.february25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckifOneStringSwapCanMakeStringsEqual {

    //1790. Check if One String Swap Can Make Strings Equal


    //두개의 문자열에서 최대 한번의 스왑으로 같은 값이 나오면 true 아니면 false

    // 두개의 단어를 각각 따로 저장해서 같은 단어면 true로 가자

    //1 실패 처음에 set으로 둘다 넣어서 사이즈만 같으면 true 반환할려고 했으나,
    //  같은 요소지만 두번 바꿔야할 경우가 있다..


    // 2 위차가 다를 경우 체크 후 그 갯수를 판별해 정확히 2개가 아닐시 false
    // 2개일 시 스왑해서 같은 지 return


    public static void main(String[] args) {

        String s1 = "bank";
        String s2 = "kanb";
        CheckifOneStringSwapCanMakeStringsEqual main = new CheckifOneStringSwapCanMakeStringsEqual();
        main.areAlmostEqual(s1, s2);
    }


    public boolean areAlmostEqual(String s1, String s2) {

        if (s1.equals(s2)) {// 같을 경우 바로 return;
            return true;
        }

        List<Integer> diffIndices = new ArrayList<>();

        // 두 문자열의 다른 인덱스 찾기
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffIndices.add(i);
            }
        }

        // 다른 부분이 정확히 2개일 때만 스왑 가능
        if (diffIndices.size() != 2) {
            return false;}

        else {
            int i = diffIndices.get(0);
            int j = diffIndices.get(1);

            // 스왑 후 같아지는지 확인
            return s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i);
        }

        // 다른 부분이 0개가 아니거나 2개보다 많으면 불가능







//        int cardinality = s1.length();
//
//        Set<Character> check = new HashSet<>();
//
//        for (int i = 0; i < cardinality; i++) {
//            check.add(s1.charAt(i));
//            check.add(s2.charAt(i));
//        }
//
//
//        if (check.size() == cardinality) {
//            return true;
//        }
//
//        return false;
//
   }
}

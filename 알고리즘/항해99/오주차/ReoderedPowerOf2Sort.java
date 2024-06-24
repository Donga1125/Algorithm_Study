package 알고리즘.항해99.오주차;

import java.util.HashSet;
import java.util.Set;

public class ReoderedPowerOf2Sort {


    public boolean reorderedPowerOf2(int n) {
        String sortedInput = sortString(String.valueOf(n));

// 2의 거듭제곱 테이블 생성
        Set<String> powerOf2s = new HashSet<>();
        for (int i = 0; i < 31; i++) {
            powerOf2s.add(sortString(Integer.toString(1 << i)));
        }

// 주어진 숫자의 정렬된 형태가 2의 거듭제곱 중 하나인지 확인
        return powerOf2s.contains(sortedInput);
    }

    private String sortString(String s) {
        char[] chars = s.toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }
}

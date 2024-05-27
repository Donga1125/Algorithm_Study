package 알고리즘.프로그래머스.항해99.일주차;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수compare {

    public static void main(String[] args) {
        int arr[] = new int[]{12, 125, 56, 44, 2, 967, 7};

        가장큰수compare main = new 가장큰수compare();
        String answer = main.solution(arr);
        System.out.println(answer);

    }

    private String solution(int[] numbers) {

    String[] strNumbers = Arrays.stream(numbers) // 정수들을 스트림으로 문자열로 변환하는 과정
            .mapToObj(String::valueOf)
            .toArray(String[]::new);


    // 정렬 comparator 인터페이스 구현을 자리수로 비교해서 구현
        Arrays.sort(strNumbers, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            String order1 = o1 + o2;
            String order2 = o2 + o1;
            return order2.compareTo(order1);
        }
    });

      // 0이 들어올 수 있으니 정렬 후에 0이면 0 return;
        if (strNumbers[0].equals("0")) {
        return "0";
    }

    // 좀 더 빠르게 StringBuilder에 담아 반환
    StringBuilder result = new StringBuilder();
        for (String number : strNumbers) {
        result.append(number);
    }

        return result.toString();
}
}

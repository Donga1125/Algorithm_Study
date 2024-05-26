package 알고리즘.프로그래머스.항해99.일주차.리트코드;

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

    String[] strNumbers = Arrays.stream(numbers)
            .mapToObj(String::valueOf)
            .toArray(String[]::new);

    // Sort strings based on custom comparator
        Arrays.sort(strNumbers, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            String order1 = o1 + o2;
            String order2 = o2 + o1;
            return order2.compareTo(order1); // Descending order
        }
    });

    // If the largest number is "0", the result is "0"
        if (strNumbers[0].equals("0")) {
        return "0";
    }

    // Join sorted strings to form the largest number
    StringBuilder result = new StringBuilder();
        for (String number : strNumbers) {
        result.append(number);
    }

        return result.toString();
}
}

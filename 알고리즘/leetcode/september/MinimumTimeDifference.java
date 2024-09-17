package 알고리즘.leetcode.september;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumTimeDifference {

    //539. Minimum Time Difference
    // 리스트 내에서 가장 작은 차를 반환
    // 첫쨰로 할 건 hh:mm이니까 23:59와 00의 차이를

    public static void main(String[] args) {

        List<String> time = new ArrayList<>();
        time.add("23:59");
        time.add("00:00");
        time.add("23:59");
        MinimumTimeDifference sol = new MinimumTimeDifference();
        System.out.println(sol.findMinDifference(time));

    }


    public int findMinDifference(List<String> timePoints) {

        List<Integer> num = new ArrayList<>();

        for (String timePoint : timePoints) {
            String[] parts = timePoint.split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            num.add(hours * 60 + minutes);
            // 나눠서 분으로만 저장


        }
        Collections.sort(num); // 오름 차순으로 비교하기 편하게
        int size = num.size();
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < size; i++) {

            minDiff = Math.min(minDiff, num.get(i) - num.get(i - 1));
            //버블 비교처럼 비교하기 현재수와 -1번째의 수를 비교해서 minDiff 갱신 (다음 큰수와 비교해서 음수될 일은 없음)

        }
        int firstLastDiff = 1440 + num.get(0) - num.get(size - 1);
        // 마지막으로 비교안한 첫수와 끝수를 비교해보기 (이 경우 음수의 경우가 있기에 1440을 더해서 그 차이만 저장
        minDiff = Math.min(minDiff, firstLastDiff);
        return minDiff;

    }
}

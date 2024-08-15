package 알고리즘.leetcode.august;

import java.util.HashMap;

public class LemonadeChange정답 {

    // 860. Lemonade Change

    //5원짜리 레몬에이드를 사기위해 5, 10, 20 달러를 지불하는 손님이 있는데, 첫 손님은 무조건 5부터 시작
    // 들어온 queue에 있는 대기열대로 거스름돈을 줄 수 있다
    // 알맞은 거스름돈을 줄 수 있는 경우(내가 받은 걸로 계산해서) 가능하다면 true , false 반환

    public static void main(String[] args) {

        int bills[] = new int[]{5, 5, 5, 10, 20};
        LemonadeChange정답 sol = new LemonadeChange정답();
        System.out.println(sol.lemonadeChange(bills));

    }

    public boolean lemonadeChange(int[] bills) {

        // 5가 들어오면 그냥 map에 추가
        // 10이 들어오면 먼저 5가 있는 지 확인 후 추가
        // 15가 들어오면 5개 3개거나, 10이 하나+5가2 개있어야 함 map에 찾고(이상), 빼주기

        HashMap<Integer, Integer> map = new HashMap<>();

        int length = bills.length;

        for (int i = 0; i < length; i++) {
            int bill = bills[i];

            if (bill == 5) {
                map.put(bill, map.getOrDefault(bill, 0) + 1);

            } else if (bill == 10) {
                if (map.containsKey(bill - 5) && map.get(bill - 5) >= 1) {

                    map.replace(bill - 5, map.get(bill - 5) - 1);
                    map.put(bill, map.getOrDefault(bill, 0) + 1);

                } else {
                    return false;
                }

            } else if (bill == 20) {
                if (map.containsKey(bill - 10)) { // 5는 3개이거나, 10은 1개 이상
                    if (map.get(bill - 10) >= 3) {

                        map.replace(bill - 10, map.get(bill - 5) - 3);
                    } else if (map.containsKey(bill - 5)) {

                        if (map.get(bill - 10) >= 2 && map.get(bill - 5) >= 1) {

                            map.replace(bill - 10, map.get(bill - 5) - 2);

                            map.replace(bill - 5, map.get(bill - 5) - 1);

                        }

                    } else
                        return false;
                } else
                    return false;

            }

            }

        return true; // 어디가 틀렸을까.. ㅠ

    }
}

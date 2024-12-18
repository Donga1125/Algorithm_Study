package 알고리즘.leetcode.december;

import java.util.Arrays;
import java.util.Stack;

public class FinalPricesWithaSpecialDiscountinaShop {

    //1475. Final Prices With a Special Discount in a Shop

    // price i번째를 특별 할인한다.
    // 할인 방법은 j > i j가 i보다 크고
    // prices[j] <= prices[i]
    // 즉 오른 쪽에 있는 인덱스여야하고, 가격이 같거나 현재 i 값보다 작아야한다.
    // 여기서 가장 작은 j의 인덱스를 가진 걸로 할인이 들어감
    // 만족하지 못한다면 할인이 없다.

    // 1 <= prices.length <= 500
    //  1 <= prices[i] <= 1000

    // 500개고 1000미만의 수다. 500개면 최대 n2가 되겠네 더 효율말고 일단 해보자

    public static void main(String[] args) {

        int[] prices = new int[] {8, 4, 6, 2, 3};
        FinalPricesWithaSpecialDiscountinaShop main = new FinalPricesWithaSpecialDiscountinaShop();
        main.finalPrices(prices);
    }

    public int[] finalPrices(int[] prices) {

        int length = prices.length;
        int answer[] = Arrays.copyOf(prices,length);
        Stack<Integer> stack = new Stack<>();


//        for (int i = 0; i < length; i++) {
//
//            for (int j = i + 1; j < length; j++) {
//
//                if (prices[i] >= prices[j]) {
//                    prices[i] -= prices[j];
//                    break;
//
//                }
//            }
//        }
//        return prices;
        // 스탹에 인덱스 넣기.
        // 현재 수와 스택에 넣은 인덱스에 해당하는 수보다 작거나 같으면 계산 해주기

        stack.push(0);
        for (int i = 1; i < length; i++) {

            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {

                int index = stack.pop();
                answer[index] -= prices[i];

            }
            stack.push(i);

            }

        while (!stack.isEmpty()) {

            int index = stack.pop();
            answer[index] = prices[index];
        }

        return answer;


        }

}

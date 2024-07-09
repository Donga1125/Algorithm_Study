package 알고리즘.leetcode;

public class WaterBottles {

    //1518. Water Bottles

    public static void main(String[] args) {
        WaterBottles main = new WaterBottles();
        main.numWaterBottles(1, 3);

    }

    public int numWaterBottles(int numBottles, int numExchange) {

        //리트코ㅈ
        int i = 0, sum = 0;

        while (i < 10) {
            i++;
            if (i % 2 == 1) {
                continue;

            }
            sum = sum + i;
        }

        System.out.println(sum);


        return 0;
    }
}
